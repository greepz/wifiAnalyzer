package app.controllers;


import app.controllers.dto.monitoring.MonitoringDto;
import app.controllers.dto.monitoring.ReportDto;
import app.services.AnalyzerService;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MonitoringController {

    @Autowired
    @Qualifier("analyzeService")
    private AnalyzerService service;


    @PostMapping("/monitoring/send")
    public ResponseEntity<String> receive(@RequestBody MonitoringDto monitoringDto) throws JsonProcessingException {
        service.save(monitoringDto);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    @GetMapping(value = "/monitoring/get")
    public ResponseEntity<List<ReportDto>> getReport(@RequestParam(name = "page", required = false, defaultValue = "0") int page,
                                                     @RequestParam(name = "size", required = false, defaultValue = "20") int size,
                                                     @RequestParam(name = "sortField", required = false, defaultValue = "analizeId") String sortField,
                                                     @RequestParam(name = "sortOrder", required = false, defaultValue = "asc") String sortOrder,
                                                     @RequestParam(name = "filterField", required = false, defaultValue = "") String filterField,
                                                     @RequestParam(name = "filterValue", required = false, defaultValue = "") String filterValue){

        List<ReportDto> list = service.getReport(page, size, sortField, sortOrder, filterField, filterValue);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}


