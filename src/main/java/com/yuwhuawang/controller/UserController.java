package com.yuwhuawang.controller;

import com.yuwhuawang.domain.UserVo;
import com.yuwhuawang.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yuwhuawang on 2017/5/8.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/{id}")
    @ResponseBody
    UserVo getUerById(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }
}
