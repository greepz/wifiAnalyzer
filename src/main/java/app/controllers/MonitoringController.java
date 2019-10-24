package app.controllers;


import app.controllers.dto.monitoring.MonitoringDto;
import app.controllers.dto.monitoring.ReportDto;
import app.controllers.dto.monitoring.WifiDetailsDto;
import app.repository.AnalizesRepository;
import app.repository.PointsRepository;
import app.repository.ReportsRepository;
import app.repository.entity.Analize;
import app.repository.entity.Point;
import app.repository.entity.Report;
import app.repository.entity.User;
import app.repository.entity.UsersRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    AnalizesRepository analizesRepository;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    ReportsRepository reportsRepository;
    @Autowired
    PointsRepository pointsRepository;

    @PostMapping("/monitoring/send")
    public ResponseEntity<String> receive(@RequestBody MonitoringDto monitoringDto) throws JsonProcessingException {
        User user = new User();
        user.setLogin("Trunov");
        user.setPassword("123");

        Analize analize = new Analize();
        analize.setUser(user);
        usersRepository.save(user);
        for(WifiDetailsDto detailsDto : monitoringDto.getWiFiDetails()){
            Report report = new Report();
            analize.getReports().add(report);
            report.setAnalize(analize);
            Point point = new Point();
            point.setBssid(detailsDto.getBssid());
            point.setSsid(detailsDto.getSsid());
            report.setPoint(point);
            pointsRepository.save(point);
        }
        analizesRepository.save(analize);

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


