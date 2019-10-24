package app.services.impl;

import app.controllers.dto.monitoring.MonitoringDto;
import app.controllers.dto.monitoring.ReportDto;
import app.converters.ReportMapper;
import app.repository.ReportsRepository;
import app.services.AnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("alalyzeService")
public class AndroidAnalyzerService implements AnalyzerService {

    @Autowired
    ReportsRepository repository;

    @Override
    public void save(MonitoringDto monitoringDto) {
        throw new RuntimeException();
    }

    @Override
    public List<ReportDto> getReport(int page, int size, String sortField, String sortOrder, String filterField, String filterValue) {

        Sort sort = new Sort(Direction.fromString(sortOrder), sortField);
        Pageable pageable = PageRequest.of(page, size, sort);
        return ReportMapper.generate(repository.findAll(pageable).getContent());

    }
}
