package com.you.huan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "Test")
public class TestController {

    @RequestMapping(value = "/helloworld")
    public String helloWorld(Model model){
        model.addAttribute("message","Hello World");
        return "helloWorld";
    }
}
