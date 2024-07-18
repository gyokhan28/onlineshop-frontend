package com.example.onlineshop_frontend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long id;
    private UserDTO user;
    private LocalDateTime orderDateTime;
    private LocalDateTime orderDeliveryDateTime;
    private LocalDateTime orderCancelDateTime;
    private OrderStatusDTO status;
    private BigDecimal price;
}
