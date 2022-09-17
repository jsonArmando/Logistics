package com.ground.logistics.utils;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@ToString
public enum LogisticsError {
    UNEXPECTED_ERROR(0, "Unexpected error."),
    ENDPOINT_NOT_FOUND(1, "Endpoint not found."),
    MAX_DUPLICATE(1, "Evaluates the duplicate value."),
    PRODUCT_QUANTITY(10, "Cantidad de producto"),
    GROUND_LOGISTICS(1, "LOGISTICA TERRESTRE"),
    ID_LOGISTICS(2,"No se encuentra el ID registrado");


    private final Integer code;
    private final String message;

    public HttpStatus getStatus() {
        switch (this) {
            case UNEXPECTED_ERROR:
                return HttpStatus.BAD_REQUEST;
            case ENDPOINT_NOT_FOUND:
                return HttpStatus.NOT_FOUND;
            case MAX_DUPLICATE:
            case ID_LOGISTICS:
                return HttpStatus.NOT_FOUND;
            default:
                return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }
}
