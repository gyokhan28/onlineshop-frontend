package com.example.onlineshop_frontend.dto;

import com.example.onlineshop_frontend.enums.OrderStatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    private Long id;
    private UserDTO user;
    private LocalDateTime orderDateTime;
    private LocalDateTime orderDeliveryDateTime;
    private LocalDateTime orderCancelDateTime;
    private OrderStatusDTO status;
    private BigDecimal price;
    private List<OrderProductDTO> orderProductList;
}
