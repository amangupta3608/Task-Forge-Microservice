package com.Task_Forge.Microservice.Service;

import com.Task_Forge.Microservice.Model.User;
import com.Task_Forge.Microservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public User createUser(User user){
//        user.setCreatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }

    public User getUserById(UUID id){
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(UUID id){
        userRepository.deleteById(id);
    }

    public User authenticateUser(String email, String password){
        //Implement authentication logic here
        return null; //Replace with actual authentication
    }
}
