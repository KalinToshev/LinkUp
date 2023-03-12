package com.softuni.linkup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    private String getIndexPage() {
        return "index.html";
    }

    @GetMapping("/home")
    private String getHomePage() {
        return "home.html";
    }
}
