package com.tfsc.grade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value={"","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("list")
    public String list(){
        return "list";
    }

    @RequestMapping("list_off")
    public String listOff(){
        return "list_off";
    }

    @RequestMapping("new")
    public String newAct(){
        return "new";
    }
}
