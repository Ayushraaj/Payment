package com.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beans.Book;


@Component
public class BookService {

	@Autowired Book book;
	
	public void aboutBook() {
		System.out.println("Running the Service class");
		book.bookDetails();
	}
}
