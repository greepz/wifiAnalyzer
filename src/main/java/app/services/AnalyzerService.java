package app.services;

import app.controllers.dto.monitoring.MonitoringDto;
import app.controllers.dto.monitoring.ReportDto;

import java.util.List;

public interface AnalyzerService {

    void save(MonitoringDto monitoringDto);
    List<ReportDto> getReport(int page, int size, String sortField, String sortOrder, String filterField, String filterValue);

}
