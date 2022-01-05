package com.bs23.service;

import com.bs23.entity.User;
import com.bs23.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll(){
        return this.userRepository.findAll();
    }

    public User save(User user){
        return this.userRepository.save(user);
    }

    public User getUserByName(String name){
        return this.userRepository.findByFirstName(name).get();
    }
}
