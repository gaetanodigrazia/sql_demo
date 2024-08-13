package com.digrazia.sql_demo.business.model.domain;

import com.digrazia.sql_demo.business.model.dto.CreateUserDTO;

public class User {

    private String id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String role;

    public User(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static User userCreation(CreateUserDTO createUserDTO) {
       User user = new User();
       user.setUsername(createUserDTO.username());
       user.setPassword(createUserDTO.password());
       user.setEmail(createUserDTO.email());
       user.setPhone(createUserDTO.phone());
       user.setRole(createUserDTO.role());

       return user;
    }
}
