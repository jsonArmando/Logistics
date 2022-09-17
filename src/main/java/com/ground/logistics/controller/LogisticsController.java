package com.ground.logistics.controller;

import com.ground.logistics.service.LogisticsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/logistics")
public class LogisticsController {
    private LogisticsService logisticsService;
}
