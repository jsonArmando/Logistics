package com.ground.logistics.service.impl;

import com.ground.logistics.dtos.LogisticsDto;
import com.ground.logistics.entities.Logistics;
import com.ground.logistics.mapper.LogisticsMapper;
import com.ground.logistics.repository.LogisticsRepository;
import com.ground.logistics.service.LogisticsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class LogisticsImpl implements LogisticsService {

    private final LogisticsMapper logisticsMapper;
    private final LogisticsRepository logisticsRepository;
    @Override
    @Transactional
    public LogisticsDto create(Logistics logistics) {
        return null;
    }
}
