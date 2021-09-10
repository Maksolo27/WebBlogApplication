package com.example.webblogapplication.reposiries;

import com.example.webblogapplication.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository  extends JpaRepository<Comment, Long>, CrudRepository<Comment, Long> {

}