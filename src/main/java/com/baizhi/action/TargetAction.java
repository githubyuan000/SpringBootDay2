package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/target")
public class TargetAction {
    @RequestMapping("/a")
    @ResponseBody
    public String A(){
        System.out.println("A");
        return "A";
    }
    @RequestMapping("/b")
    @ResponseBody
    public String B(){
        System.out.println("B");
        return "B";
    }
    @RequestMapping("/c")
    @ResponseBody
    public String C(){
        System.out.println("C");
        return "C";
    }


}
