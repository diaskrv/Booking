package com.example.booking.controllers;

import com.example.booking.domain.UserEntity;
import com.example.booking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public List<UserEntity> getUsersInfo(){
        return userService.getAllUsers();
    }

    @GetMapping("/index/{id}")
    public ResponseEntity<UserEntity> userDetail(@PathVariable int id){
        return ResponseEntity.ok(userService.findById(id));
    }

//        @RequestMapping(value="/index")
//    public String getUsersInfo(Model model){
//        model.addAttribute("users", userService.getAllUsers());
//        return "index";
//    }
}
