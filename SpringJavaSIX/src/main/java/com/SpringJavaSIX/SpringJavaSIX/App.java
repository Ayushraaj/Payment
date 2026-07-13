package com.SpringJavaSIX.SpringJavaSIX;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.AppConfig;
import com.beans.Amazon;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Amazon amazon = (Amazon) applicationContext.getBean("Amazon");
    	amazon.Greetings();
    }
}
