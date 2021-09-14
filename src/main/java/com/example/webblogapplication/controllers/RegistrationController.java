package com.example.webblogapplication.controllers;


import com.example.webblogapplication.entities.Role;
import com.example.webblogapplication.entities.User;
import com.example.webblogapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Model model){
/*        User dbUser = userService.getByUserName(user.getUserName());
        if(dbUser != null){
            model.asMap().put("message", "User exists");
            return "registration";
        }*/
        user.setRoles(Collections.singleton(Role.USER));
        user.setActive(true);
        userService.add(user);
        return "redirect:/login";
    }

}
