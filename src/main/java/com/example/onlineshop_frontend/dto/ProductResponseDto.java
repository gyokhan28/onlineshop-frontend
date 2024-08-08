package com.example.onlineshop_frontend.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ProductResponseDto {
  private Long id;
  private String name;
  private String productType;
  private BigDecimal price;
  private int quantity;
  private String imageLocation;
  private Color color;
  private Brand brand;
  private Material material;
  private LocalDate bestBefore;
  private LocalDate expiryDate;
}
