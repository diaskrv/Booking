package com.example.booking.repositories;

import com.example.booking.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersViewRepository extends JpaRepository<UserEntity, Integer> {

    List<UserEntity> findAll();
    Optional<UserEntity> findById(Integer id);
}
