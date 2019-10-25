package app.services.impl;

import app.controllers.dto.iperf.request.IntervalDto;
import app.controllers.dto.iperf.request.IperfDtoWithInfo;
import app.controllers.dto.iperf.response.LatencyTestInfo;
import app.controllers.dto.iperf.response.LatencyTestPoint;
import app.repository.LatencyTestRepository;
import app.repository.PointsRepository;
import app.repository.UsersRepository;
import app.repository.entity.LatencyPoint;
import app.repository.entity.LatencyTest;
import app.repository.entity.Point;
import app.repository.entity.User;
import app.services.IperfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Component
public class AndroidIperfService implements IperfService {

    @Autowired
    LatencyTestRepository latencyTestRepository;
    @Autowired
    PointsRepository pointsRepository;
    @Autowired
    UsersRepository usersRepository;

    @Override
    public void save(IperfDtoWithInfo iperfDto) {
        LatencyTest latencyTest;
        User user = usersRepository.findUserByLoginAndPassword("Trunov", "123");
        if (latencyTestRepository.findById(iperfDto.getInfo().getUuid()).isPresent()) {
            latencyTest = latencyTestRepository.findById(iperfDto.getInfo().getUuid()).get();
        } else{
            latencyTest = new LatencyTest();
        }
        latencyTest.setUser(user);
        if (pointsRepository.findById(iperfDto.getInfo().getBssid()).isPresent()){
            latencyTest.setPoint(pointsRepository.findById(iperfDto.getInfo().getBssid()).get());
        }else{
            Point point = new Point();
            point.setBssid(iperfDto.getInfo().getBssid());
            point.setSsid(iperfDto.getInfo().getSsid());
            pointsRepository.save(point);
            latencyTest.setPoint(point);
        }
        latencyTest.setId(iperfDto.getInfo().getUuid());
        latencyTest.setCreated(iperfDto.getIperf().getStart().getTimestamp().getTimesecs());
        latencyTest.setVersion(iperfDto.getIperf().getStart().getVersion());
        latencyTest.setSystemInfo(iperfDto.getIperf().getStart().getSystem_info());
        latencyTest.setAcceptedConnectionHost(iperfDto.getIperf().getStart().getConnected().get(0).getRemote_host());
        latencyTest.setAcceptedConnectionPort(iperfDto.getIperf().getStart().getConnected().get(0).getRemote_port());
        latencyTest.setProtocol(iperfDto.getIperf().getStart().getTest_start().getProtocol());
        latencyTest.setDuration(iperfDto.getIperf().getStart().getTest_start().getDuration());
        if (iperfDto.getIperf().getEnd().getSum_sent().isSender()) {
            latencyTest.setSummarySendBytes(iperfDto.getIperf().getEnd().getSum_sent().getBytes());
            latencyTest.setSummarySendBps(iperfDto.getIperf().getEnd().getSum_sent().getBits_per_second());
        }else{
            latencyTest.setSummaryReceiveBytes(iperfDto.getIperf().getEnd().getSum_received().getBytes());
            latencyTest.setSummaryReceiveBps(iperfDto.getIperf().getEnd().getSum_received().getBits_per_second());
        }
        latencyTestRepository.save(latencyTest);
        for(IntervalDto interval : iperfDto.getIperf().getIntervals()){
            LatencyPoint latencyPoint = new LatencyPoint();
            latencyPoint.setTest(latencyTest);
            latencyPoint.setStart(interval.getSum().getStart());
            latencyPoint.setEnd(interval.getSum().getEnd());
            latencyPoint.setBytes(interval.getSum().getBytes());
            latencyPoint.setBps(interval.getSum().getBits_per_second());
            latencyPoint.setSender(interval.getSum().isSender());
            latencyTest.getPoints().add(latencyPoint);
        }
        latencyTestRepository.save(latencyTest);
    }

    public LatencyTestInfo getLatencyReportById(String id){
        return generateLatencyReport(latencyTestRepository.findById(id).get());
    }

    public List<LatencyTestInfo> getLatencyReports(){
        List<LatencyTestInfo> latencyTestInfos = new ArrayList<>();
        for (LatencyTest latencyTest : latencyTestRepository.findAll()){
            latencyTestInfos.add(generateLatencyReport(latencyTest));
        }
        return latencyTestInfos;
    }

    public LatencyTestInfo generateLatencyReport(LatencyTest latencyTest){
        LatencyTestInfo latencyTestInfo = new LatencyTestInfo();
        latencyTestInfo.setUuid(latencyTest.getId());
        latencyTestInfo.setSsid(latencyTest.getPoint().getSsid());
        latencyTestInfo.setBssid(latencyTest.getPoint().getBssid());
        latencyTestInfo.setDate(new Date(latencyTest.getCreated()));
        latencyTestInfo.setLogin(latencyTest.getUser().getLogin());
        latencyTestInfo.setAverageDownload(latencyTest.getSummaryReceiveBps());
        latencyTestInfo.setAverageUpload(latencyTest.getSummarySendBps());
        latencyTestInfo.setDuration(latencyTest.getDuration());
        latencyTestInfo.setHost(latencyTest.getAcceptedConnectionHost());
        latencyTestInfo.setPort(latencyTest.getAcceptedConnectionPort());
        for(LatencyPoint point : latencyTest.getPoints()){
            LatencyTestPoint testPoint = new LatencyTestPoint();
            testPoint.setStart(point.getStart());
            testPoint.setEnd(point.getEnd());
            testPoint.setBps(point.getBps());
            testPoint.setBytes(point.getBytes());
            if (point.getSender()){
                latencyTestInfo.getUploadPoints().add(testPoint);
            }else{
                latencyTestInfo.getDownloadPoints().add(testPoint);
            }
        }
        return latencyTestInfo;
    }
}
