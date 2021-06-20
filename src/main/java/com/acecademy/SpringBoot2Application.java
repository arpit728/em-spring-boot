package com.acecademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.acecademy.dao.BookDao;
import com.acecademy.entity.Book;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot2Application.class, args);

//		BookDao bookDao = context.getBean(BookDao.class);
//
////		Book book = bookDao.save(new Book(2, "Book2", "A2"));
////		System.out.println(book);
//		
//		System.out.println(bookDao.findById(1).get());
//		System.out.println(bookDao.findByAuthor("Book2"));
//	
//		System.out.println(bookDao.findByTitle("A2"));
//		
//		System.out.println("getByAuthor " + bookDao.getByAuthor("Book2"));
//		
//		
//		System.out.println("getAll " + bookDao.getAll());
	}

	
	
}
