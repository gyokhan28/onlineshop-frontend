package com.example.onlineshop_frontend.enums;

import lombok.Getter;

@Getter
public enum RoleType {
    ROLE_ADMIN(1),
    ROLE_EMPLOYEE(2),
    ROLE_USER(3);
    private final long id;

    RoleType(long id) {
        this.id = id;
    }
}
