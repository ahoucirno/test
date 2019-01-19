package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
    @RequestMapping("/out")
    @ResponseBody
    public String out(){
        return "success";
    }
}
