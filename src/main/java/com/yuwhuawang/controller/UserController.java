package com.yuwhuawang.controller;

import com.yuwhuawang.config.WebSecurityConfig;
import com.yuwhuawang.domain.UserVo;
import com.yuwhuawang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping("/loginPost")
    public
    @ResponseBody
    Map<String, Object> logintPost(String account, String password, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        if (!"123456".equals(password)) {
            map.put("success", false);
            map.put("message", "密码错误");
            return map;
        }

        session.setAttribute(WebSecurityConfig.SESSION_KEY, account);
        map.put("success", true);
        map.put("message", "登录成功");
        return map;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }
}

