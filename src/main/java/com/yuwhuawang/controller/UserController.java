package com.yuwhuawang.controller;

import com.yuwhuawang.DTO.LoginDto;
import com.yuwhuawang.domain.UserVo;
import com.yuwhuawang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuwhuawang on 17/5/4.
 */

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/search")
    public List<UserVo> queryByNickname(@RequestParam(value = "nickname") String nickname) {
        return userService.getByNickName(nickname);
    }

    @GetMapping(value="/login")
    public String login() {
        return "user/login";
    }


    @PostMapping(value="/login")
    public String loginAction(
                                LoginDto user,
                              HttpSession session) {
        if (!"123456".equals(user.getPassword())) {
            return "redirect:/login";
        }
        session.setAttribute("test", user.getAccount());
        return "redirect:/";

    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("test");
        return "redirect:/login";
    }
}
