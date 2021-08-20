package com.zhaoqw.example.springboot_study;

import com.zhaoqw.example.springboot_study.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStudyApplicationTests {
	@Autowired
	Person person;
	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
