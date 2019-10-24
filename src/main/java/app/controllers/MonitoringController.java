package app.controllers;


import app.controllers.dto.monitoring.MonitoringDto;
import app.controllers.dto.monitoring.ReportDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@RestController
public class MonitoringController {

    @PostMapping("/monitoring/send")

    public ResponseEntity<String> receive(@RequestBody MonitoringDto monitoringDto) throws JsonProcessingException {

        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    @GetMapping("/monitoring/get")
    public ResponseEntity<List<ReportDto>> getReport(@RequestParam(name = "page", required = false) int page,
                                                     @RequestParam(name = "sortField", required = false) String sortField,
                                                     @RequestParam(name = "sortOrder", required = false) String sortOrder,
                                                     @RequestParam(name = "filterField", required = false) String filterField,
                                                     @RequestParam(name = "filterValue", required = false) String filterValue){



        return new ResponseEntity<>(new LinkedList<>(), HttpStatus.OK);
    }


}


