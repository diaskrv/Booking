package com.example.booking.controllers;

import com.example.booking.domain.UserEntity;
import com.example.booking.repositories.UserRepository;
import com.example.booking.repositories.UsersViewRepository;
import com.example.booking.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    @GetMapping("/index")
//    public List<UserEntity> getUsersInfo(){
//        return userService.getAllUsers();
//    }

    @RequestMapping(value="/index")
    public String getUsersInfo(Model model){

        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }
}
