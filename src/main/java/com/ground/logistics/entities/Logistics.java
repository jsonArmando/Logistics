package com.ground.logistics.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document("logistics")
public class Logistics {
    @Id
    private String id;
    private String kindProduct;
    private Long productQuantity;
    private Date registrationDate;
    private Date deadLine;
    private String deliveryPort;
    private Double shippingPrice;
    private Integer transportLogisticsType;
    private String transportLogisticsNumber;
    private String guideNumber;
}
