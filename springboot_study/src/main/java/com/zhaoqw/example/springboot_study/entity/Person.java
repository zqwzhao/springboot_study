package com.zhaoqw.example.springboot_study.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/11 - 08 - 11 - 12:34
 * @Description: com.zhaoqw.example.springboot_study.entity
 * @version: 1.0
 */

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    //或者用@Value("${person.name}")
    private String name;
    private Integer age;
    private String sex;
    private List<String> likes;


    public Person() {
    }

    public Person(String name, Integer age, String sex, List<String> likes) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", likes=" + likes +
                '}';
    }
}
