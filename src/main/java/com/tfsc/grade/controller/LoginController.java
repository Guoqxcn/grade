package com.tfsc.grade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login(ModelMap map){
        map.addAttribute("welcome","欢迎使用系统。");
        return "login";
    }

}
