package app.controllers;

import app.controllers.dto.iperf.request.IperfDto;
import app.controllers.dto.iperf.request.IperfDtoWithInfo;
import app.controllers.dto.iperf.response.LatencyTestInfo;
import app.services.impl.AndroidIperfService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class IperController {

    @Autowired
    AndroidIperfService iperfService;

    @PostMapping("/iperf/send")
    public ResponseEntity<String> receive(@RequestBody String request) throws Exception {
        request = request.replaceAll("\\\\","");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        IperfDtoWithInfo iperfDto = mapper.readValue(request, IperfDtoWithInfo.class);
        iperfService.save(iperfDto);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    @GetMapping("/iperf/get")
    public ResponseEntity<List<LatencyTestInfo>> getReport(@RequestParam(name = "page", required = false) Integer page,
                                                   @RequestParam(name = "sortField", required = false) String sortField,
                                                   @RequestParam(name = "sortOrder", required = false) String sortOrder,
                                                   @RequestParam(name = "filterField", required = false) String filterField,
                                                   @RequestParam(name = "filterValue", required = false) String filterValue,
                                                   @RequestParam(name = "startDateTime", required = false) LocalDateTime startDateTime,
                                                   @RequestParam(name = "endDateTime", required = false) LocalDateTime endDateTime){

        List<LatencyTestInfo> latencyTestInfos = iperfService.getLatencyReports();

        return new ResponseEntity<>(latencyTestInfos, HttpStatus.OK);
    }

    @GetMapping(value = "/iperf/get/{id}")
    public ResponseEntity<LatencyTestInfo> getReport(@PathVariable(name = "id") String id){
        LatencyTestInfo latencyTestInfo =  iperfService.getLatencyReportById(id);
        return new ResponseEntity<>(latencyTestInfo, HttpStatus.OK);
    }
}
