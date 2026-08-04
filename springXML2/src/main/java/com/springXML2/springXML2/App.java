package com.springXML2.springXML2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.Amazon;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Amazon amazon = (Amazon) applicationContext.getBean("amazon");
    	amazon.display();
    	
    }
}
