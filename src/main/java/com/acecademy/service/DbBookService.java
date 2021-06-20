package com.acecademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acecademy.dao.BookDao;
import com.acecademy.entity.Book;

@Component("dbBookService")
public class DbBookService {
	
	
	@Autowired
	private BookDao bookDao;
	
	
	public List<Book> getAll() {
		return bookDao.getAll();
	}

}
