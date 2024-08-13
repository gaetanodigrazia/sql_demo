package com.digrazia.sql_demo.business.service;

import com.digrazia.sql_demo.business.model.domain.User;

public interface UserService {
   User createUser(User userToCreate);

   User findById(String id);
}
