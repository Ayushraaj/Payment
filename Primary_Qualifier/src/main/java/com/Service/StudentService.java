package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Beans.Student;

@Component
public class StudentService {
	
	@Autowired
	@Qualifier("student2")
	private Student student;
	
	public void display() {
		System.out.println("this is a service file");
		student.details();
	}
	
	
	

}
