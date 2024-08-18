package com.example.onlineshop_frontend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private LocalDate dateOfBirth;
    private BigDecimal salary;
    private String phoneNumber;
    private JobDTO jobType;
    private RoleDTO role;
    private LocalDateTime createdAt;
    private boolean isEnabled;
}
