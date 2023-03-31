package com.example.booking.services;

import com.example.booking.domain.UserEntity;
import com.example.booking.repositories.UsersViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersViewRepository usersViewRepository;

    public List<UserEntity> getAllUsers(){
        List<UserEntity> usersList = new ArrayList<>();
        usersViewRepository.findAll().forEach(users -> usersList.add(users));
        return usersList;
    }
    public UserEntity findById(Integer id){
        return usersViewRepository.findById(id).orElse(null);
    }
}
