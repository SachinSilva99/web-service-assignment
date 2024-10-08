package com.example.awsassignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    public String loginSubmit(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              Model model) {
        if ("user".equals(username) && "password".equals(password)) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Invalid username or passwordss");
            return "login";
        }
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
