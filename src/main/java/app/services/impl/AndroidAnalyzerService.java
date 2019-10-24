package app.services.impl;

import app.controllers.dto.monitoring.MonitoringDto;
import app.controllers.dto.monitoring.ReportDto;
import app.converters.ReportMapper;
import app.repository.entity.Report;
import app.services.AnalyzerService;

import java.util.ArrayList;
import java.util.List;


public class AndroidAnalyzerService implements AnalyzerService {

    @Override
    public void save(MonitoringDto monitoringDto) {
        throw new RuntimeException("stub for analyzer service");
    }

    @Override
    public List<ReportDto> getReport(int page, int size, String sortField, String sortOrder, String filterField, String filterValue) {
        return ReportMapper.generate(new ArrayList<Report>());
    }
}
