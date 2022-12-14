package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {
//    原来的：http://localhost:8080/add?a=1&b=2
    @RequestMapping("/add")
    public String test1(int a,int b,Model model){
        int res=a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
//    RESTful风格
    @RequestMapping("/add2/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
}