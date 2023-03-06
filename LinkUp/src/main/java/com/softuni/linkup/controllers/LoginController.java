package com.softuni.linkup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/users/login")
    private String getLoginPage() {
        return "login.html";
    }
}
