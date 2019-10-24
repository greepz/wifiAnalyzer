package app.converters;

import app.controllers.dto.monitoring.*;
import app.repository.entity.Analize;
import app.repository.entity.Point;
import app.repository.entity.Report;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ReportMapper {

    public static List<ReportDto> generate(List<Analize> analizes){
        List<ReportDto> reportDtos = new LinkedList<>();
        for(Analize analize: analizes){
            for(Report report: analize.getReports()){
                ReportDto reportDto = new ReportDto();
                reportDto.setId(report.getReportId());
                reportDto.setUser(analize.getUser().getLogin());
                reportDto.setReportDate(new Date(analize.getCreated()));
                reportDto.setPointDto(mapReport(report));
                reportDtos.add(reportDto);
            }
        }

        return reportDtos;
    }

    private static WifiDetailsDto mapReport(Report report){
        WifiDetailsDto wifiDetailsDto = new WifiDetailsDto();
        wifiDetailsDto.setBsid(report.getPoint().getBssid());
        wifiDetailsDto.setBssid(report.getPoint().getBssid());
        wifiDetailsDto.setCapabilities(report.getPoint().getCapabilities());
        wifiDetailsDto.setHidden(report.isHidden());
        wifiDetailsDto.setSecurity(report.getSecurity());
        wifiDetailsDto.setSsid(report.getPoint().getSsid());

        wifiDetailsDto.setWiFiSignal(new WifiSignalDto());

        wifiDetailsDto.getWiFiSignal().setCenterFrequency(report.getCenterFrequency());

        wifiDetailsDto.getWiFiSignal().setCenterWiFiChannel(new WifiChannelDto());
        wifiDetailsDto.getWiFiSignal().getCenterWiFiChannel().setChannel(report.getCenterWiFiChannel());
        wifiDetailsDto.getWiFiSignal().getCenterWiFiChannel().setFrequency(report.getCenterWiFiFrequency());

        wifiDetailsDto.getWiFiSignal().setChannelDisplay(report.getChannelDisplay());
        wifiDetailsDto.getWiFiSignal().setDistance(report.getDistance());
        wifiDetailsDto.getWiFiSignal().setFrequencyEnd(report.getFrequencyEnd());
        wifiDetailsDto.getWiFiSignal().setFrequencyStart(report.getFrequencyStart());
        wifiDetailsDto.getWiFiSignal().setIs80211mc(report.isIs80211mc());
        wifiDetailsDto.getWiFiSignal().setLevel(report.getLevel());
        wifiDetailsDto.getWiFiSignal().setPrimaryWiFiChannel(new WifiChannelDto());
        wifiDetailsDto.getWiFiSignal().getPrimaryWiFiChannel().setChannel(report.getPrimaryWiFiChannel());
        wifiDetailsDto.getWiFiSignal().getPrimaryWiFiChannel().setFrequency(report.getPrimaryWiFiFrequency());
        wifiDetailsDto.getWiFiSignal().setStrength(report.getStrength());
        wifiDetailsDto.getWiFiSignal().setWiFiBand(report.getWiFiBand());
        wifiDetailsDto.getWiFiSignal().setWiFiWidth(report.getWiFiWidth());


        return wifiDetailsDto;
    }

    private static WifiAdditionalDto mapWifiAdditional() {

        WifiAdditionalDto wifiAdditionalDto = new WifiAdditionalDto();
       // wifiAdditionalDto.setVendorName();

        return wifiAdditionalDto;

    }

    private static WifiSignalDto mapWifiSignal(){
        WifiSignalDto wifiSignalDto = new WifiSignalDto();


        return wifiSignalDto;
    }

}
