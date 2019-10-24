package app.services.impl;

import app.controllers.dto.monitoring.MonitoringDto;
import app.controllers.dto.monitoring.ReportDto;
import app.controllers.dto.monitoring.WifiDetailsDto;
import app.converters.ReportMapper;
import app.repository.AnalizesRepository;
import app.repository.PointsRepository;
import app.repository.ReportsRepository;
import app.repository.UsersRepository;
import app.repository.entity.*;
import app.services.AnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


@Component("analyzeService")
public class AndroidAnalyzerService implements AnalyzerService {


    @Autowired
    AnalizesRepository analizesRepository;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    ReportsRepository reportsRepository;
    @Autowired
    PointsRepository pointsRepository;

    @Override
    public void save(MonitoringDto monitoringDto) {


        //TODO - пока
        User user = usersRepository.findUserByLoginAndPassword("Trunov","123");

        Analize analize = new Analize();
        analize.setUser(user);
        analize.setCreated(System.currentTimeMillis());
        for(WifiDetailsDto detailsDto : monitoringDto.getWiFiDetails()){
            Report report = new Report();
            analize.getReports().add(report);
            report.setAnalize(analize);
            Point point = new Point();
            point.setBssid(detailsDto.getBssid());
            point.setSsid(detailsDto.getSsid());
            point.setCapabilities(detailsDto.getCapabilities());
            pointsRepository.save(point);
            report.setPoint(point);
            report.setPrimaryFrequency(detailsDto.getWiFiSignal().getPrimaryFrequency());
            report.setCenterFrequency(detailsDto.getWiFiSignal().getCenterFrequency());
            report.setWiFiWidth(detailsDto.getWiFiSignal().getWiFiWidth());
            report.setLevel(detailsDto.getWiFiSignal().getLevel());
            report.setIs80211mc(detailsDto.getWiFiSignal().isIs80211mc());
            report.setWiFiBand(detailsDto.getWiFiSignal().getWiFiBand());
            report.setFrequencyStart(detailsDto.getWiFiSignal().getFrequencyStart());
            report.setFrequencyEnd(detailsDto.getWiFiSignal().getFrequencyEnd());
            report.setStrength(detailsDto.getWiFiSignal().getStrength());
            report.setDistance(detailsDto.getWiFiSignal().getDistance());
            report.setChannelDisplay(detailsDto.getWiFiSignal().getChannelDisplay());
            report.setPrimaryWiFiChannel(detailsDto.getWiFiSignal().getPrimaryWiFiChannel().getChannel());
            report.setPrimaryWiFiFrequency(detailsDto.getWiFiSignal().getPrimaryWiFiChannel().getFrequency());
            report.setPrimaryWiFiChannel(detailsDto.getWiFiSignal().getCenterWiFiChannel().getChannel());
            report.setPrimaryWiFiFrequency(detailsDto.getWiFiSignal().getCenterWiFiChannel().getFrequency());
            report.setSecurity(detailsDto.getSecurity());
            report.setHidden(detailsDto.isHidden());

        }
        analizesRepository.save(analize);




    }

    @Override
    public List<ReportDto> getReport(int page, int size, String sortField, String sortOrder, String filterField, String filterValue) {

        Sort sort = new Sort(Direction.fromString(sortOrder), sortField);
        Pageable pageable = PageRequest.of(page, size, sort);
        return ReportMapper.generate(analizesRepository.findAll(pageable).getContent());

    }
}
