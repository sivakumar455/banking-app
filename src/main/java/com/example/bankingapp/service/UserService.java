package com.example.bankingapp.service;

import com.example.bankingapp.entity.User;
import com.example.bankingapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findUser(Integer id){
        Optional<User> user  = userRepository.findById(id);
        return user.get();
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }

    public User createUser(User user){
        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
