package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {

    @GetMapping("/")
    public String home() {
        return "✅ Financial Investment & Portfolio Management System is running successfully!";
    }
}

