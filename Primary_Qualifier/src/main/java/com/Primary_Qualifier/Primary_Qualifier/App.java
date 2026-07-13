package com.Primary_Qualifier.Primary_Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Configuration.AppConfig;
import com.Service.StudentService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        
        StudentService s  = applicationContext.getBean(StudentService.class);
        s.display();
        
        
    }
}
