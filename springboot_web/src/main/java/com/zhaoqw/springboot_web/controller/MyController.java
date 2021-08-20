package com.zhaoqw.springboot_web.controller;

import com.zhaoqw.springboot_web.servlet.MyHttpSessionListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionListener;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/12 - 08 - 12 - 20:12
 * @Description: com.zhaoqw.springboot_web.controller
 * @version: 1.0
 */

@RestController
public class MyController {

    @RequestMapping("/hello")
    public String hello(HttpSession session) {
        session.setAttribute("zqe","aaa");
        return "hello_world";
    }

    @RequestMapping("online")
    @ResponseBody
    public String online(){
        return "当前在线人数："+ MyHttpSessionListener.online +"人";
    }
}
