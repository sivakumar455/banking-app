package com.example.bankingapp.controller;

import com.example.bankingapp.entity.User;
import com.example.bankingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/users/{id}")
    public User findUser(@PathVariable Integer id){
        return userService.findUser(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @PostMapping("/users")
    public void createUser(@Valid @RequestBody User user){
        userService.createUser(user);
    }
}
