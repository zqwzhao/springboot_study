package com.zhaoqw.example.springboot_study;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//如果这个类的位置发生变化，加上@ComponentScan("com.zhaoqw")
@SpringBootApplication
public class SpringbootStudyApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudyApplication.class, args);

	}


}
