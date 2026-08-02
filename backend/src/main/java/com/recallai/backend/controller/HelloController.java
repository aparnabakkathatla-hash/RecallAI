package com.recallai.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to RecallAI 🚀";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from RecallAI Backend!";
    }
}