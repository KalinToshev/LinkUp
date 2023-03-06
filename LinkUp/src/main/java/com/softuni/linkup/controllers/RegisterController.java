package com.softuni.linkup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    @GetMapping("/users/register")
    private String getRegisterPage() {
        return "register.html";
    }
}
