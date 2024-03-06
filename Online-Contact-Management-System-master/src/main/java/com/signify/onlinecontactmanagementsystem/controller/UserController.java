package com.signify.onlinecontactmanagementsystem.controller;

import com.signify.onlinecontactmanagementsystem.entity.User;
import com.signify.onlinecontactmanagementsystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/v1/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/api/v1/users/{userId}")
    public User getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/api/v1/users/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/api/v1/users/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return userService.deleteUser(userId);
    }
}
