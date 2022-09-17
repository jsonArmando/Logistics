package com.ground.logistics.mapper;

import com.ground.logistics.dtos.LogisticsDto;
import com.ground.logistics.entities.Logistics;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Date;

@Mapper(componentModel = "spring")
public interface LogisticsMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "kindProduct", target = "kindProduct")
    @Mapping(source = "productQuantity", target = "productQuantity")
    @Mapping(source = "registrationDate", target = "registrationDate")
    @Mapping(source = "deadLine", target = "deadLine")
    @Mapping(source = "guideNumber", target = "guideNumber")
    LogisticsDto toResponse(Logistics logistics);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "kindProduct", target = "kindProduct")
    @Mapping(source = "productQuantity", target = "productQuantity")
    @Mapping(source = "registrationDate", target = "registrationDate")
    @Mapping(source = "deadLine", target = "deadLine")
    @Mapping(source = "guideNumber", target = "guideNumber")
    LogisticsDto toSave(Logistics logistics);
}
