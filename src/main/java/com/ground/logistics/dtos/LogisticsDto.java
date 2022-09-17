package com.ground.logistics.dtos;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
@Data
public class LogisticsDto {
    @Id
    private String id;
    private String kindProduct;
    private Long productQuantity;
    private Date registrationDate;
    private Date deadLine;
    private String guideNumber;
    private String code;
    private String message;
}
