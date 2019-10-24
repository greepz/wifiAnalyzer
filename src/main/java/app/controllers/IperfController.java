package app.controllers;

import app.controllers.dto.iperf.IperfDto;
import app.services.IperfService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IperfController {


    @Autowired
    IperfService service;

    @PostMapping("/send")
    public void receive(IperfDto data){
        ObjectMapper mapper = new ObjectMapper();
        try{

            System.out.println(mapper.writeValueAsString(data));
        }catch (JsonProcessingException ex){
            ex.printStackTrace();
        }
    }

}
