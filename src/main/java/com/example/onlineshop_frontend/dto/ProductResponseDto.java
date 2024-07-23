package com.example.onlineshop_frontend.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductResponseDto {
  private Long id;
  private String name;
  private BigDecimal price;
  private int quantity;
  private String imageLocation;
}
