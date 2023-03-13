package com.example.luo.sendMessage.controllers;

import com.example.luo.sendMessage.dto.User;
import com.example.luo.sendMessage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/send")
    public String send() {
        List<User> user = userService.getList();
        return user.toString();
    }
}
