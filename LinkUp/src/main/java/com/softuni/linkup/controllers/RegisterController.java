package com.softuni.linkup.controllers;

import com.softuni.linkup.models.dtos.UserRegistrationDTO;
import com.softuni.linkup.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    private final UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/register")
    private String getRegisterPage() {
        return "register.html";
    }
}
