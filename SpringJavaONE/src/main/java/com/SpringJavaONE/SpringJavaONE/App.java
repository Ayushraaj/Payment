package com.SpringJavaONE.SpringJavaONE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.AppConfig;
import com.pojo.Student;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Student student = (Student) applicationContext.getBean("stu");
    	
    	student.studentDetail();
    	
    }
}
