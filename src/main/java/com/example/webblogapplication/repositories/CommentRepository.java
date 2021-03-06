package com.example.webblogapplication.repositories;

import com.example.webblogapplication.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository  extends JpaRepository<Comment, Long>, CrudRepository<Comment, Long> {
    List<Comment> getAllByUserId(long id);
}
