package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.beans.Book;

@Configuration
@ComponentScan(basePackages = "com.BookService")
public class AppConfig {
	
	@Bean("Book1")
	@Primary
	public Book createBook() {
		Book b = new Book("Your Dreams Are Mine Now",1100 ,"Ayush", "About hope", true);
		return b;
	}
	
	@Bean("Book2")
	public Book createBook1() {
		Book b1 = new Book("Your Dreams Are Mine Now",1100 ,"Ayush", "About hope", false);
		return b1;
	}

}
