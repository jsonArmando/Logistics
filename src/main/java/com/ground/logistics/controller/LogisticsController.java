package com.ground.logistics.controller;

import com.ground.logistics.dtos.LogisticsDto;
import com.ground.logistics.entities.Logistics;
import com.ground.logistics.service.LogisticsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/logistics")
public class LogisticsController {
    private LogisticsService logisticsService;
    @PostMapping(value ="/create",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LogisticsDto> create(@Valid @RequestBody Logistics logistics){
        return new ResponseEntity<LogisticsDto>(logisticsService.create(logistics),HttpStatus.CREATED);

    }

}
