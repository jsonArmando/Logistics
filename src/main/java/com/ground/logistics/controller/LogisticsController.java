package com.ground.logistics.controller;

import com.ground.logistics.dtos.LogisticsDto;
import com.ground.logistics.entities.Logistics;
import com.ground.logistics.service.LogisticsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/api/logistics")
public class LogisticsController {
    private LogisticsService logisticsService;
    @GetMapping
    public Iterable findAll(){
        return logisticsService.findAll();
    }
    @GetMapping("/{id}")
    public List<Logistics> findOne(@PathVariable String id){
        return logisticsService.findByProduct(id);
    }

    @PostMapping(value ="/create",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LogisticsDto> create(@Valid @RequestBody Logistics logistics){
        return new ResponseEntity<LogisticsDto>(logisticsService.create(logistics),HttpStatus.CREATED);

    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        logisticsService.delete(id);
    }

    @PutMapping("/{id}")
    public LogisticsDto updateLogistics(@RequestBody Logistics logistics, @PathVariable String id){
        return  logisticsService.updateLogistics(logistics,id);
    }


}
