package com.example.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.user.mapper.UserMapper;
import com.example.user.po.User;
import com.example.user.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    @Cacheable(value="UsersCache", key="'getAllUsers'")
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    @CacheEvict(value="UsersCache", key="'getAllUsers'")
    public void delete(Integer id) {
        userMapper.delete(id);
    }
}
