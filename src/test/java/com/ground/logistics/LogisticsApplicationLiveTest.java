package com.ground.logistics;

import com.ground.logistics.dtos.LogisticsDto;
import com.ground.logistics.entities.Logistics;
import com.ground.logistics.mapper.LogisticsMapper;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import java.util.Date;

import org.junit.Test;
import org.springframework.http.HttpStatus;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.junit.Assert.assertEquals;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@RequiredArgsConstructor
public class LogisticsApplicationLiveTest {
    private static final String API_ROOT= "http://localhost:8080/v1/api/logistics/";
    private static final String TOKEN ="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqc29ucm9qYXMiLCJleHAiOjE2NjM0ODM2NDEsImlhdCI6MTY2MzQ2NTY0MX0.GkKJ-ZDMbb9Bun8tH5vzEgbzCWerSIsR2-VGNnvfPdaoROFhuELdbffxR8lPKGRz_vXiUs-xtd-nDYNAou96_A";

    private LogisticsDto createRandomLogistics(){
        Logistics logistics = new Logistics();
        logistics.setId("6326195e27c8fd147b4eec8a");
        logistics.setKindProduct(randomAlphabetic(10));
        logistics.setProductQuantity(10L);
        logistics.setRegistrationDate(new Date());
        logistics.setDeadLine(new Date());
        logistics.setDeliveryPort(randomAlphabetic(10));
        logistics.setShippingPrice(10.0);
        logistics.setTransportLogisticsType(2);
        logistics.setTransportLogisticsNumber(randomAlphabetic(10));
        logistics.setGuideNumber(randomAlphabetic(10));

        var dto =new LogisticsDto();
        dto.setId("6326195e27c8fd147b4eec8a");
        dto.setKindProduct(randomAlphabetic(10));
        dto.setProductQuantity(10L);
        dto.setRegistrationDate(new Date());
        dto.setDeadLine(new Date());
        dto.setGuideNumber(randomAlphabetic(10));
        dto.setCode(String.valueOf(HttpStatus.CREATED));
        dto.setMessage("Se ha creado registro con Éxito!");

        return dto;
    }

    private String createLogisticsAsUri(Logistics logistics) {
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(logistics)
                .post(API_ROOT);
        return API_ROOT + "/" + response.jsonPath().get("id");
    }

    @Test
    public void whenGetAllLogistics_thenOK() {
        RestAssured.baseURI = API_ROOT;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Authorization", "Bearer " + TOKEN);
        Response response = httpRequest.request(Method.GET);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    }

    @Test
    public void whenGetNotExistLogistics_thenNotFound() {
        Response response = RestAssured.get(API_ROOT + "/" + randomNumeric(4));
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatusCode());
    }
}
