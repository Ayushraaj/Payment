package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pojo.Student;



@Configuration
public class AppConfig {
	
	@Bean("stu")
	public Student createStudent() {
		
		Student student = new Student();
		student.setName("Ayush");
		student.setCollege("VIT");
		return student;
	}

}
