package com.yz.oa.manageSystem.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/handler")
    public String  handler(){
        System.out.println("1223");
        return "hello.jsp";
    }
}
