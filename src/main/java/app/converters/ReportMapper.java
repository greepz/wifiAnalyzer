package app.converters;

import app.controllers.dto.monitoring.ReportDto;
import app.controllers.dto.monitoring.WifiAdditionalDto;
import app.controllers.dto.monitoring.WifiDetailsDto;
import app.controllers.dto.monitoring.WifiSignalDto;
import app.repository.entity.Analize;
import app.repository.entity.Point;
import app.repository.entity.Report;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReportMapper {

    public static List<ReportDto> generate(List<Analize> analizes){
        List<ReportDto> reportDtos = new LinkedList<>();
        for(Analize analize: analizes){
            for(Report report: analize.getReports()){
                ReportDto reportDto = new ReportDto();
                reportDto.setUser(analize.getUser().getLogin());
                reportDto.setReportDate(null);
                reportDto.setPointDto(mapReport(report.getPoint()));
                reportDtos.add(reportDto);
            }
        }

        return reportDtos;
    }

    private static WifiDetailsDto mapReport(Point point){
        WifiDetailsDto wifiDetailsDto = new WifiDetailsDto();
        wifiDetailsDto.setBsid(point.getBssid());
        //wifiDetailsDto.setCapabilities();
        //wifiDetailsDto.setHidden();
        //wifiDetailsDto.setSecurity(report.getPoint().getBssid());
        wifiDetailsDto.setSsid(point.getSsid());
        //wifiDetailsDto.setWifiAdditional(mapWifiAdditional());
        //wifiDetailsDto.setWifiSignal(report.getPoint().getSsid());
        //wifiDetailsDto.setChildren();
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
