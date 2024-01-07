package com.springsecurity.jwt.sb3authapi.services;

import com.springsecurity.jwt.sb3authapi.entities.User;
import com.springsecurity.jwt.sb3authapi.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
}
