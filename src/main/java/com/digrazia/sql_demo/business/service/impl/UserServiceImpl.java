package com.digrazia.sql_demo.business.service.impl;

import com.digrazia.sql_demo.business.model.domain.User;
import com.digrazia.sql_demo.business.service.UserService;
import com.digrazia.sql_demo.integration.mapper.UserMapper;
import com.digrazia.sql_demo.integration.persistence.entity.UserEntity;
import com.digrazia.sql_demo.integration.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User createUser(User userToCreate) {
        UserEntity userToPersist = userMapper.fromUserToUserEntity(userToCreate);

        UserEntity userSaved = userRepository.save(userToPersist);

        return userMapper.fromUserEntityToUser(userSaved);
    }

    @Override
    public User findById(String id) {
        User foundUser = new User();
        Optional<UserEntity> userEntityOptional = userRepository.findById(id);

        if (userEntityOptional.isPresent()) {
            foundUser =  userMapper.fromUserEntityToUser(userEntityOptional.get());
        }

        return foundUser;
    }
}
