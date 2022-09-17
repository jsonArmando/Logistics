package com.ground.logistics.service.impl;

import com.ground.logistics.dtos.LogisticsDto;
import com.ground.logistics.entities.Logistics;
import com.ground.logistics.exception.LogisticsIdMismatchException;
import com.ground.logistics.mapper.LogisticsMapper;
import com.ground.logistics.repository.LogisticsRepository;
import com.ground.logistics.service.LogisticsService;
import com.ground.logistics.utils.LogisticsError;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestClientException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class LogisticsImpl implements LogisticsService {

    private final LogisticsMapper logisticsMapper;
    private final LogisticsRepository logisticsRepository;

    @Override
    public Iterable findAll() {
        return logisticsRepository.findAll();
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
        log.debug("LogisticsImpl (create logistics)"+logistics);
        List<Logistics> logisticsList = logisticsRepository.findByGuideNumber(logistics.getGuideNumber());

        if(!CollectionUtils.isEmpty(logisticsList)){
            if(logisticsList.size()>=LogisticsError.MAX_DUPLICATE.getCode()) {
                log.error("validate LogisticsImpl");
                throw new LogisticsIdMismatchException(LogisticsError.MAX_DUPLICATE.getMessage());
            }
        }

        if(logistics.getProductQuantity()>LogisticsError.PRODUCT_QUANTITY.getCode()){
            Double price =0.0;
            if(logistics.getTransportLogisticsType().equals(LogisticsError.GROUND_LOGISTICS.getCode())){
                price = logistics.getShippingPrice()*0.05;
            }else{
                price = logistics.getShippingPrice()*0.03;
            }
            price = logistics.getShippingPrice()-price;
            logistics.setShippingPrice(price);
        }

        logisticsRepository.save(logistics);
        var result = logisticsMapper.toSave(logistics);
        result.setCode(String.valueOf(HttpStatus.CREATED));
        result.setMessage("Se ha creado registro con Éxito!");
        return result;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public LogisticsDto updateLogistics(Logistics logistics, Long id) {
        return null;
    }
}
