package com.example.booking.serviceImplementations;

import com.example.booking.domain.User;
import com.example.booking.repositories.UserRepository;
import com.example.booking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementations implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementations(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> save(User user) {
        return Optional.of(userRepository.save(user));
    }

    @Override
    public List<User> saveAll(List<User> users) {
        return null;
    }

    @Override
    public Optional<User> update(User car) {
        return Optional.empty();
    }

    @Override
    public Optional<User> get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public Boolean deleteById(Long id) {
        return null;
    }

    @Override
    public Boolean deleteAll() {
        return null;
    }
}