package com.SpringXmlFOUR.SpringXmlFOUR;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Abstraction;

public class App 
{
    public static void main( String[] args )
    {
        
    	String xml_path = "bean.xml";
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml_path);
    	
    	System.out.println("-------------------");
    	System.out.println("Abstraction using Spring XML");
    	System.out.println("-------------------");
    	
    	Abstraction abstraction = (Abstraction)applicationContext.getBean("abstraction");
    	abstraction.payment();
    }
}
