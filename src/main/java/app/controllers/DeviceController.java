package app.controllers;

import app.controllers.dto.common.DeviceDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class DeviceController {

    @GetMapping("/device/get")
    public ResponseEntity<List<DeviceDto>> get(@RequestParam(name = "page", required = false) int page,
                                              @RequestParam(name = "sortField", required = false) String sortField,
                                              @RequestParam(name = "sortOrder", required = false) String sortOrder,
                                              @RequestParam(name = "filterField", required = false) String filterField,
                                              @RequestParam(name="filterValue", required = false) String filterValue){

        List<DeviceDto> deviceDtos = new LinkedList<>();
        return new ResponseEntity<>(deviceDtos, HttpStatus.OK);
    }

}
