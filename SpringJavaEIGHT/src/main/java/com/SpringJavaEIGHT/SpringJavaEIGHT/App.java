package com.SpringJavaEIGHT.SpringJavaEIGHT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.Beans.BookStore;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
       BookStore b = (BookStore)ap.getBean("Book");
       b.bookDetails();
    }
}
