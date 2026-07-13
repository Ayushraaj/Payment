package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.Beans.Employee;

@Configuration
@ComponentScan(basePackages = "com.EmployeeService")
public class AppConfig {
	
	@Bean("Emp1")
	@Primary
	public Employee createEmp() {
		Employee e1 = new Employee("Ayush","CSE", "SWE", "KA");
		return e1;
	}
	
	@Bean("Emp2")
	public Employee createEmp2() {
		Employee e2 = new Employee("Ayush1", "CSSE Core", "SWE1", "KA");
		return e2;
	}

}
