package com.graduate.project.service.impl;

import com.graduate.project.entity.User;
import com.graduate.project.mapper.UserMapper;
import com.graduate.project.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }


}
