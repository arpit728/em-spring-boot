package com.acecademy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.AbstractClientHttpResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acecademy.entity.Book;
import com.acecademy.service.BookService;
import com.acecademy.service.DbBookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@Autowired
	private DbBookService dbBookService;
	
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return dbBookService.getAll();
	}
	
	@GetMapping("books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") int id) {
		Book book = bookService.get(id);
		if (book != null) {
			return ResponseEntity.ok(book);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("books")
	public Book addBook(@RequestBody Book book) {
		return bookService.add(book);
	}
	
	@DeleteMapping("books/{id}")
	public Book deleteBook(@PathVariable int id) {
		Book book = bookService.get(id);
		bookService.delete(id);
		return book;
	}
	
	@PutMapping("books")
	public Book update(@RequestBody Book book) {
		return bookService.update(book);
	}

}
