package com.application.services;

import com.application.entities.User;
import com.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }

    public void createUser(User user){  userRepository.createUser(user); }

    public List<User> getUsers(){return  userRepository.getUsers(); }
}
