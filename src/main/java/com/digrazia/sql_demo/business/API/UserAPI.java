package com.digrazia.sql_demo.business.API;

import com.digrazia.sql_demo.business.model.dto.CreateUserDTO;
import com.digrazia.sql_demo.business.model.dto.CreatedUserDTO;
import com.digrazia.sql_demo.business.model.dto.UserDTO;
import org.springframework.validation.annotation.Validated;

public interface UserAPI {

    CreatedUserDTO createUser(@Validated CreateUserDTO createUserDTO);

    UserDTO findById(String id);
}
