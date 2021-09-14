package com.example.webblogapplication.services;

import com.example.webblogapplication.entities.Comment;
import com.example.webblogapplication.entities.User;
import com.example.webblogapplication.repositories.CommentRepository;
import com.example.webblogapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommentRepository commentRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getById(long id){
        return userRepository.getById(id);
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public boolean add(User user){
        userRepository.saveAndFlush(user);
        return true;
    }

    public void deleteById(long id){
        userRepository.deleteById(id);
    }

    public List<Comment> getCommentList(long id){
        return commentRepository.getAllByUserId(id);
    }
    public User getByUserName(String userName){
        return userRepository.getUserByUserName(userName);
    }

}
