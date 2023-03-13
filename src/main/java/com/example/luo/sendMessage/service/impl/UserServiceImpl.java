package com.example.luo.sendMessage.service.impl;

import com.example.luo.sendMessage.dto.User;
import com.example.luo.sendMessage.mapper.UserMapper;
import com.example.luo.sendMessage.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getList() {

        return userMapper.selectUser();
    }
}
