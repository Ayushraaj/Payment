package com.SingletonTWO.SingletonTWO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AmazonService.AmazonService;
import com.AppConfig.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
        AmazonService amazonService = ap.getBean(AmazonService.class);
        amazonService.userDetails();
        
        AmazonService amazonService1 = ap.getBean(AmazonService.class);
        amazonService1.userDetails();
        
        
        System.out.println("-------------------------");
        System.out.println(amazonService == amazonService1);
    }
}
