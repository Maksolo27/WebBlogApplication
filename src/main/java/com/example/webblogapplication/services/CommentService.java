package com.example.webblogapplication.services;

import com.example.webblogapplication.entities.Comment;
import com.example.webblogapplication.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment getById(long id){
        return commentRepository.getById(id);
    }

    public List<Comment> getAll(){
        return commentRepository.findAll();
    }

    public Comment update(Comment comment){
        return commentRepository.save(comment);
    }

    public void deleteById(long id){
        commentRepository.deleteById(id);
    }
}
