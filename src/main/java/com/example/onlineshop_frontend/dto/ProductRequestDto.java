package com.example.onlineshop_frontend.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDto {
  private String name;
  private BigDecimal price;
  private int quantity;
  private String imageLocation;
  private LocalDate expiryDate;
  private LocalDate bestBefore;
  private Material material;
  private Brand brand;
  private Color color;
  private boolean isBiodegradable;
  private boolean isReusable;
  private boolean isNonSlip;
  private boolean isOutdoor;
}
