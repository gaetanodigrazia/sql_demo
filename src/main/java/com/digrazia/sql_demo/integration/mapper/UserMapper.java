package com.digrazia.sql_demo.integration.mapper;

import com.digrazia.sql_demo.business.model.domain.User;
import com.digrazia.sql_demo.business.model.dto.CreateUserDTO;
import com.digrazia.sql_demo.business.model.dto.CreatedUserDTO;
import com.digrazia.sql_demo.business.model.dto.UserDTO;
import com.digrazia.sql_demo.integration.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User fromCreateUserDTOToUser(CreateUserDTO createUserDTO);

    CreatedUserDTO fromUserToCreatedUserDTO(User user);

    UserEntity fromUserToUserEntity(User user);

    User fromUserEntityToUser(UserEntity userEntity);

    UserDTO fromUserToUserDTO(User user);
}
