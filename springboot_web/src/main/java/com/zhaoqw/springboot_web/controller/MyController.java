package com.zhaoqw.springboot_web.controller;

import com.zhaoqw.springboot_web.entity.Person;
import com.zhaoqw.springboot_web.servlet.MyHttpSessionListener;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @Auther: zhaoqw
 * @Date: 2021/8/12 - 08 - 12 - 20:12
 * @Description: com.zhaoqw.springboot_web.controller
 * @version: 1.0
 */

@Controller
public class MyController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg","Hello,SpringBoot");
        return "hello";
    }

   /* @RequestMapping("online")
    @ResponseBody
    public String online(){
        return "当前在线人数："+ MyHttpSessionListener.online +"人";
    }*/


    @RequestMapping("/thyemleaf")
    public String thyemleaf(ModelMap map) {
        map.put("thText","th:text设置文本内容 <b>加粗</b>");
        map.put("thUText","th:utext 设置文本内容 <b>加粗</b>");
        map.put("thValue","thValue 设置当前元素的value值");
        map.put("thEach","Arrays.asList(\"th:each\", \"遍历列表\")");
        map.put("thIf","msg is not null");
        map.put("thObject",new Person("zhangsan",12,"男"));
        return "thymeleaf";
    }
}
