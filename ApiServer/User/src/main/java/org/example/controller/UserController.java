package org.example.controller;

import org.example.mapper.UserMapper;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("userInfo")
    public List<User> userInfo(){
        return userMapper.selectList(null);
    }
}
