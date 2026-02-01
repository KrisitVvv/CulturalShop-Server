package com.example.culturalshop_back.Controller;

import com.example.culturalshop_back.Domain.User;
import com.example.culturalshop_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        boolean success = userService.registerUser(user);
        if (success) {
            return "New record created successfully";
        } else {
            return "Registration failed";
        }
    }
}
