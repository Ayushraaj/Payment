package com.SpringJavaSEVEN.SpringJavaSEVEN;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.Beans.Person;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
       Person person = (Person) ap.getBean("Person");
       person.PersonDetails();
    }
}
