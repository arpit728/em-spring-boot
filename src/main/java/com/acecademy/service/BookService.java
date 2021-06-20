package com.acecademy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acecademy.dao.BookDao;
import com.acecademy.entity.Book;


@Component("bookService")
public class BookService {
	

	private static List<Book> books = new ArrayList<Book>() {
		{

			add(new Book(1, "Head First Java", "A"));
			add(new Book(2, "Let Us c", "B"));
			add(new Book(3, "Alchemis", "C"));
			add(new Book(4, "Zero To One", "D"));

		}
	};
	
	
	public Book add(Book book) {
		books.add(book);
		return book;
	}
	
	public Book get(int id) {
		Book book = books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
		return book;
	}
	
	public List<Book> get() {
		return books;
	}
	
	public void delete(int id) {
		
		books.removeIf(book -> book.getId() == id);
		
	}
	
	public Book update(Book book) {
		Book oldBook = get(book.getId());
		if (oldBook != null) {
			oldBook.setAuthor(book.getAuthor());
			oldBook.setTitle(book.getTitle());
		}
		return oldBook;
	}

}
