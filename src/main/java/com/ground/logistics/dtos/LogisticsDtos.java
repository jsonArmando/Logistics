package com.ground.logistics.dtos;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
@Data
public class LogisticsDtos {
    @Id
    private String id;
    private String kindProduct;
    private Long productQuantity;
    private Date registrationDate;
    private Date deadLine;
    private String code;
    private String message;
}
