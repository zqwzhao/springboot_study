package com.zhaoqw.example.springboot_study.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/12 - 08 - 12 - 19:01
 * @Description: com.zhaoqw.example.springboot_study.annotation
 * @version: 1.0
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {
    String name() default "zhangsan";
}


class Test{
    @MyAnnotation(name="shangsan")
    private String name;

    @MyAnnotation
    public void hehe() {
        System.out.println("hehe....");
    }
}