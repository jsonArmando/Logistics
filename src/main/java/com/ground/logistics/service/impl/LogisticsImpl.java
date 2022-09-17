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

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class LogisticsImpl implements LogisticsService {

    private final LogisticsMapper logisticsMapper;
    private final LogisticsRepository logisticsRepository;

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public List findByProduct(String kindProduct) {
        return null;
    }

    @Override
    public LogisticsDto findOne(Long id) {
        return null;
    }

    @Override
    @Transactional
    public LogisticsDto create(Logistics logistics) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public LogisticsDto updateBook(Logistics logistics, Long id) {
        return null;
    }
}
