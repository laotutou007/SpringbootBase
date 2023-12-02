package com.example.today.controller;

import com.example.today.pojo.User;
import com.example.today.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping()
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @GetMapping("()")
    public List<User> getUserById(){
        return userService.getUserList();
    }



}
