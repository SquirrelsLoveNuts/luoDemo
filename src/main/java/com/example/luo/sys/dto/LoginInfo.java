package com.example.luo.sys.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LoginInfo implements Serializable {
    private Integer id;

    private String userAccount;

    private String userIp;

    private String loginResult;

    private Date loginDate;

    private static final long serialVersionUID = 1L;

}