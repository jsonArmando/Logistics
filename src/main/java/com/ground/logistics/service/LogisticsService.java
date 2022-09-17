package com.ground.logistics.service;

import com.ground.logistics.dtos.LogisticsDto;
import com.ground.logistics.entities.Logistics;

public interface LogisticsService {
    LogisticsDto create(Logistics logistics);
}
