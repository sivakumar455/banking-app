package com.example.bankingapp.service;

import com.example.bankingapp.entity.User;
import com.example.bankingapp.errorhandler.UserNotFoundException;
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
        if(user.isEmpty()){
            throw new UserNotFoundException("User not found for id:"+id);
        }
        return user.get();
    }

    public void deleteUser(Integer id){
        Optional<User> user  = userRepository.findById(id);
        if(user.isEmpty()){
            throw new UserNotFoundException("User not found for id:"+id);
        }else{
            userRepository.deleteById(id);
        }

    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
