package com.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.Beans.Student;

@Configuration
@ComponentScan(basePackages = "com.Service")
public class AppConfig {
	
	
	@Bean("student1")
	@Primary
	public Student createStudent() {
		
		Student s = new Student("Ayush", "Raj", "India");
		return s;
	}
	
	
	@Bean("student2")
	public Student createStudent1() {
		Student s1 = new Student("Ayush1", "Raj1", " India1");
		return s1;
	}

}
