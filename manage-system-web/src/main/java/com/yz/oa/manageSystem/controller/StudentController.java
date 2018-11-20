package com.yz.oa.manageSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/handle")
    public String handle(){
        System.out.println("111");
        System.out.println("djada");
        return "index.jsp";
    }

    /**
     * 成绩查询
     */
    public String findGrade(){
        return "";
    }

    /**
     * 课表查询
     */
    public String findCourse(){
        return "";
    }
}
