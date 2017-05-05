package com.yuwhuawang.controller;

import com.yuwhuawang.config.WebSecurityConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yuwhuawang on 17/5/5.
 */
@Controller
public class BaseController {
    @GetMapping("/")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String email, Model model) {
        model.addAttribute("nickname", email);
        return "base/index";
    }
}
