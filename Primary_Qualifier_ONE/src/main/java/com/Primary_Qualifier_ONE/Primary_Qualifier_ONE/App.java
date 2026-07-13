package com.Primary_Qualifier_ONE.Primary_Qualifier_ONE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.EmployeeService.EmployeeService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
        
        EmployeeService e = ap.getBean(EmployeeService.class);
        e.EmployeeService();
    }
}
