package com.digrazia.sql_demo.business.model.dto;

public record CreateUserDTO(String username, String password, String email, String phone, String role) {
}
