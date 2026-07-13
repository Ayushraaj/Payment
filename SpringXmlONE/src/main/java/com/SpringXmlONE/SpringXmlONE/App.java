package com.SpringXmlONE.SpringXmlONE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	String xml_path = "bean.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml_path);
        
        Student student = (Student) applicationContext.getBean("stu");
        //student.studentDetail();
        String name =student.getName();
        System.out.println(name);
    }
    
}
