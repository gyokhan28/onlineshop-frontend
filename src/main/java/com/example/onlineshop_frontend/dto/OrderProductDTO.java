package com.example.onlineshop_frontend.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProductDTO {
    private Long id;
    private OrderDTO order;
    private ProductDTO product;
    private int quantity;
    private BigDecimal productPriceWhenPurchased;
}