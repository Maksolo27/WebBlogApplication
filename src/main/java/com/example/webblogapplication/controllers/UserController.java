package com.example.webblogapplication.controllers;

import com.example.webblogapplication.entities.User;
import com.example.webblogapplication.services.CommentService;
import com.example.webblogapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private CommentService commentService;

    @GetMapping
    public String getUserList(Model model){
        List<User> userList = userService.getAll();
        model.addAttribute(userList);
        return "users";
    }

    @GetMapping("{id}")
    public String getSelectedUser(Model model, @PathVariable Long id){
        User user = userService.getById(id);
        model.addAttribute("user", user);
        model.addAttribute("userComments", userService.getCommentList(id));
        return "user";
    }
}
