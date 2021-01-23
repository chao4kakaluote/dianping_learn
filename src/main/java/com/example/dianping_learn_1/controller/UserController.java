package com.example.dianping_learn_1.controller;

import com.example.dianping_learn_1.model.UserModel;
import com.example.dianping_learn_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/user")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello Spring";
    }
    @RequestMapping("/get")
    @ResponseBody
    public UserModel getUser(Integer id) {
        return userService.getUser(id);
    }
}
