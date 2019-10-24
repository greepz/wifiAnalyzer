package app.controllers;

import app.controllers.dto.iperf.IperfDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class IperController {

    @PostMapping("/iperf/send")

    public ResponseEntity<String> receive(@RequestBody IperfDto iperfDto) throws JsonProcessingException {
        System.out.println(new ObjectMapper().writeValueAsString(iperfDto));
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    @GetMapping("/iperf/get")
    public ResponseEntity<IperfDto> getReport(@RequestParam(name = "page", required = false) int page,
                                                   @RequestParam(name = "sortField", required = false) String sortField,
                                                   @RequestParam(name = "sortOrder", required = false) String sortOrder,
                                                   @RequestParam(name = "filterField", required = false) String filterField,
                                                   @RequestParam(name = "filterValue", required = false) String filterValue,
                                                   @RequestParam(name = "startDateTime", required = false) LocalDateTime startDateTime,
                                                   @RequestParam(name = "endDateTime", required = false) LocalDateTime endDateTime){



        return new ResponseEntity<>(new IperfDto(), HttpStatus.OK);
    }

}
