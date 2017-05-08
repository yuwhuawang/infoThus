package com.yuwhuawang.controller;

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
    public String index(@SessionAttribute("test") String name, Model model) {
        model.addAttribute("name", name);
        return "base/index";
    }
}
