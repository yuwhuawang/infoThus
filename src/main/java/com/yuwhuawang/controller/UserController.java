package com.yuwhuawang.controller;

import com.yuwhuawang.domain.UserVo;
import com.yuwhuawang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yuwhuawang on 17/5/4.
 */

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/search")
    public List<UserVo> queryByNickname(@RequestParam(value = "nickname") String nickname) {
        return userService.getByNickName(nickname);
    }
}
