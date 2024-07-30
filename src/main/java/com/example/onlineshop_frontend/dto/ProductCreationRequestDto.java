package com.example.onlineshop_frontend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCreationRequestDto {
    private String productType;
    private ProductRequestDto productRequestDto;
}
