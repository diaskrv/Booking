package com.example.booking.services;

import com.example.booking.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> save(User user);

    List<User> saveAll(List<User> users);

    Optional<User> update(User car);

    Optional<User> get(Long id);

    List<User> getAll();

    Boolean deleteById(Long id);

    Boolean deleteAll();

}
