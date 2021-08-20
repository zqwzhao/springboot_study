package com.zhaoqw.example.springboot_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/11 - 08 - 11 - 12:02
 * @Description: com.zhaoqw.example.springboot_study.controller
 * @version: 1.0
 */


//@Controller
@RestController
public class HelloController {

    //@ResponseBody   用controller的话需要加上
    @RequestMapping("/hello")
    public String hello() {
        return "hello_world";
    }
}
