package app.converters;

import app.controllers.dto.monitoring.ReportDto;
import app.repository.entity.Report;

import java.util.ArrayList;
import java.util.List;

public class ReportMapper {

    public static List<ReportDto> generate(List<Report> reports){
        return new ArrayList<>();
    }

}
