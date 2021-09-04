package com.zhaoqw.springboot_web.controller;

import com.zhaoqw.springboot_web.servlet.MyHttpSessionListener;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * @Auther: zhaoqw
 * @Date: 2021/8/12 - 08 - 12 - 20:12
 * @Description: com.zhaoqw.springboot_web.controller
 * @version: 1.0
 */

@RestController
public class MyController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg","Hello,SpringBoot");
        return "hello";
    }

    @RequestMapping("online")
    @ResponseBody
    public String online(){
        return "当前在线人数："+ MyHttpSessionListener.online +"人";
    }


    @RequestMapping("thyemleaf")
    public String thyemleaf() {
        return "thyemleaf";
    }
}
