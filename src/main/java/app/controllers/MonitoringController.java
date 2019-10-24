package app.controllers;


import app.controllers.dto.monitoring.MonitoringDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@RestController
public class MonitoringController {

    @PostMapping("/monitoring/send")

    public ResponseEntity<String> getMonitoringData(@RequestBody MonitoringDto monitoringDto) throws JsonProcessingException {



        System.out.println(new ObjectMapper().writeValueAsString(monitoringDto));
        try (PrintWriter writer = new PrintWriter(new FileWriter("1.txt", true))) {
            writer.print(new ObjectMapper().writeValueAsString(monitoringDto));
        } catch (IOException e) {
            // ... handle IO exception
        }

        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}


