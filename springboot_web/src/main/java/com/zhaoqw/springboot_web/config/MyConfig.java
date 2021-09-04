package com.zhaoqw.springboot_web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-03 22:29]
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/zhaoqw").setViewName("hello");
    }
}
