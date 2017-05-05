package com.yuwhuawang.controller;

import com.yuwhuawang.domain.UserVo;
import com.yuwhuawang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

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

    @PostMapping(value = "/login")
    public String loginAction(Model model,
                              @ModelAttribute(value = "user") UserVo userVo,
                              HttpServletResponse response,
                              HttpSession session) {
        session.setAttribute();
    }
}
