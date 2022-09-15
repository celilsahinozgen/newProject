package com.newProject.newProject.service;


import com.newProject.newProject.entity.User;
import com.newProject.newProject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user){
        userRepository.save(user);
        return user;
    }

    public User update(User user){
        userRepository.save(user);
        return user;
    }
    public boolean delete(User user){
        try {
            userRepository.delete(user);
            return  true;
        }catch (Exception exception) {
            return false;
        }


    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(Long id) {
        Optional<User> user= userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }else
            return null;
    }
    public boolean isPassword(String username,String password){
            User user= userRepository.findByUsernameAndPassword(username,password);
            if (user==null) {
                return false;
            }else {
                return true;
            }

    }
}
