package com.ground.logistics.service;

import com.ground.logistics.dtos.LogisticsDto;
import com.ground.logistics.entities.Logistics;

import java.util.List;

public interface LogisticsService {
    Iterable findAll();
    List findByProduct(String kindProduct);
    LogisticsDto create(Logistics logistics);
    void delete(String id);
    LogisticsDto updateLogistics(Logistics logistics,String id);
}
