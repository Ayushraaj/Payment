package com.SpringXmlAGAIN1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.School;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        
        School school = (School) applicationContext.getBean("school");
        school.display();
        
    }
}
