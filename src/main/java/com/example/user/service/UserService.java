package com.example.user.service;

import com.example.user.po.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void delete(Integer id);
}
