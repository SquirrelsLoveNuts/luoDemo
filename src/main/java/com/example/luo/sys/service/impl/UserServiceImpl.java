package com.example.luo.sys.service.impl;

import com.example.luo.sys.components.GetIpUtil;
import com.example.luo.sys.components.LoginInfoConstants;
import com.example.luo.sys.dto.LoginInfo;
import com.example.luo.sys.dto.ResponseData;
import com.example.luo.sys.dto.User;
import com.example.luo.sys.mapper.LoginInfoMapper;
import com.example.luo.sys.mapper.UserMapper;
import com.example.luo.sys.service.UserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private LoginInfoMapper loginInfoMapper;

    @Override
    public ResponseData<String> loginCheck(HttpServletRequest request, ResponseData<String> responseData) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        Example failExample = new Example(User.class);
        failExample.createCriteria().andEqualTo("userAccount",account);
        List<User> existsUser = userMapper.selectByExample(failExample);
        if (existsUser.size() == 1) {
            Example example = new Example(User.class);
            example.createCriteria().andEqualTo("userAccount",account)
                    .andEqualTo("password",password);
            List<User> user = userMapper.selectByExample(example);
            if (user.size() == 1) {
                responseData.setSuccess(Boolean.TRUE);
                responseData.setCode(LoginInfoConstants.LOGIN_SUCCESS);
                responseData.setMsg("登陆成功！");
            } else {
                responseData.setSuccess(Boolean.FALSE);
                responseData.setCode(LoginInfoConstants.LOGIN_FAIL);
                responseData.setMsg("请检查账号与密码是否正确！");
            }
        } else {
            responseData.setSuccess(Boolean.FALSE);
            responseData.setCode(LoginInfoConstants.LOGIN_NO_ACCOUNT);
            responseData.setMsg("请注册账号！");
        }
        recordLoginInfo(request, responseData, account);
        return responseData;
    }

    private void recordLoginInfo(HttpServletRequest request, ResponseData<String> responseData, String account) {
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setUserAccount(account);
        loginInfo.setLoginDate(new Date());
        loginInfo.setUserIp(GetIpUtil.getIpAddr(request));
        loginInfo.setLoginResult(responseData.getCode());
        loginInfoMapper.insert(loginInfo);
    }



}