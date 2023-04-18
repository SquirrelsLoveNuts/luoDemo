package com.example.luo.sys.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userAccount;

    private String password;

    private Integer age;

    private String sex;

    private String telephone;

    private String email;

    private Integer roleId;

    private Date creationTime;

    private Integer createdBy;

    private Date updateTime;

    private Integer updatedBy;

    private static final long serialVersionUID = 1L;
}
