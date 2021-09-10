package com.example.webblogapplication.services;

import com.example.webblogapplication.entities.User;
import com.example.webblogapplication.reposiries.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getById(long id){
        return userRepository.getById(id);
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public User add(User user){
        return userRepository.saveAndFlush(user);
    }

    public void deleteById(long id){
        userRepository.deleteById(id);
    }
}
