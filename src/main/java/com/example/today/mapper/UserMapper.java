package com.example.today.mapper;

import com.example.today.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
//    @Select("select * from user")
    List<User> getUserList();
}
