package com.wei.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class IndexController {
    @RequestMapping("/test")
    public String index(Model m){
        m.addAttribute("msg","hello,springboot");
        m.addAttribute("list", Arrays.asList(1,2,3,4));
        return "test";
    }

    @RequestMapping("/map")
    public String map(){
        System.out.println("1111111111");
        return "new_file";
    }
    @PostMapping("/tomap")
    public String tomap(String loacted,String lat,String log,Model m){
        m.addAttribute("located",loacted);
        m.addAttribute("lat",lat);
        m.addAttribute("log",log);
        System.out.println(loacted);
        return "new_file1";
    }
    @RequestMapping("/getRound")
    public String getGround(){
        return "getRound";
    }
    @RequestMapping("/main")
    public String goMain(){
        return "main";
    }
}
