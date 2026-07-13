package com.Primary_Qualifier_Three.Primary_Qualifier_Three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.BookService.BookService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bookService = ap.getBean(BookService.class);
        bookService.aboutBook();
    }
}
