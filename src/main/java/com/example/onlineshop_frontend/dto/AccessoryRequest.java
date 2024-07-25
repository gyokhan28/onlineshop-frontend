package com.example.onlineshop_frontend.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
public class AccessoryRequest {
    private String name;
    private BigDecimal price;
    private int quantity;
    private String imageLocation;
    private Long brand;
    private Long color;

}
