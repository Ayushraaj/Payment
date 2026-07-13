package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Beans.BookStore;

@Configuration
public class AppConfig {

	@Bean("Book")
	public BookStore createBook() {
		BookStore b = new BookStore();
		b.setBookName("Your dreams are mine now");
		b.setAuthorName("Ayush");
		b.setDescription("This book is for the onces who belives in hope");
		b.setPrice(1100);
		b.setIsAvailable(true);
		return b;
	}
}
