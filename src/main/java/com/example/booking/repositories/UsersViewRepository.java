package com.example.booking.repositories;

import com.example.booking.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsersViewRepository extends JpaRepository<UserEntity, Integer> {

    List<UserEntity> findAll();
//    UserEntity findByUsername(String username);
//    UserEntity findById(int id);
}
