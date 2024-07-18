package com.example.onlineshop_frontend.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderResponseDto {
    List<OrderDTO> orders;
}
