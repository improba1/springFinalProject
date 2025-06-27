package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/auth")
public class AuthPageController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // имя шаблона из resources/templates/login.html
    }
}