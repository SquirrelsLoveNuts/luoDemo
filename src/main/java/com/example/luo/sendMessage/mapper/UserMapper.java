package com.example.luo.sendMessage.mapper;

import com.example.luo.sendMessage.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectUser();
}
