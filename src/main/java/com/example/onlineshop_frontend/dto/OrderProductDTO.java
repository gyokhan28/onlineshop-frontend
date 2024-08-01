package com.example.onlineshop_frontend.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProductDTO {
    private Long id;
    private String productName;
    private int quantity;
    private BigDecimal productPriceWhenPurchased;
}