package com.digrazia.sql_demo.integration.persistence.repository;

import com.digrazia.sql_demo.integration.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    Optional<UserEntity> findById(String id);

    UserEntity save(UserEntity user);
}
