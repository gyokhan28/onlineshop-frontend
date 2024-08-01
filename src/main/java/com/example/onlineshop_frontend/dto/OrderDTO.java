package com.example.onlineshop_frontend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    private Long id;
    private UserDTO userResponseDto;
    private LocalDateTime orderDateTime;
    private LocalDateTime orderDeliveryDateTime;
    private LocalDateTime orderCancelDateTime;
    private String status;
    private BigDecimal price;
    private List<OrderProductDTO> orderProducts;
}
