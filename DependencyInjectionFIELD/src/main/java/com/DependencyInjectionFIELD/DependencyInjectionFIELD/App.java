package com.DependencyInjectionFIELD.DependencyInjectionFIELD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.BeanConfig.BeanConfig;
import com.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext ap = new AnnotationConfigApplicationContext(BeanConfig.class);
    	Student s = (Student)ap.getBean(Student.class);
    	System.out.println(s);
    	
    }
}
