package com.example.luo.sys.controllers;

import com.example.luo.sys.dto.ResponseData;
import com.example.luo.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

@Controller
public class SysLoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login/check/up")
    @ResponseBody
    public Object logins(HttpServletRequest request) {
        ResponseData<String> responseData = new ResponseData<>();
        return userService.loginCheck(request, responseData);
    }

    @RequestMapping("/login")
    public String login(){

        return "hand";
    }

}
