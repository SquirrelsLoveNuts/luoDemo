package com.example.luo.sys.service;

import com.example.luo.sys.dto.ResponseData;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    ResponseData<String> loginCheck(HttpServletRequest request, ResponseData<String> responseData);
}
