package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.user.po.User;
import com.example.user.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/del/{id}")
    public void delete(@PathVariable String id) {
        userService.delete(Integer.parseInt(id));
    }
}
