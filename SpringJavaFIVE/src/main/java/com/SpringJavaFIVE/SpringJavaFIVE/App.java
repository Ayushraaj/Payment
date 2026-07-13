package com.SpringJavaFIVE.SpringJavaFIVE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.appConfig.AppConfig;
import com.bean.School;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext applicationoContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	School sc = (School) applicationoContext.getBean("school");
    	sc.printName();
    }
}
