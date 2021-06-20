package com.acecademy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.acecademy.entity.Book;


@Component("bookDao")
public interface BookDao extends CrudRepository<Book, Integer> {
	
	
	List<Book> findByAuthor(String author);
	
	List<Book> findByTitle(String title);
	
	@Query("select b from Book b where b.author = :a")
	List<Book> getByAuthor(@Param("a") String author);
	
	@Query(value = "select * from book", nativeQuery = true)
	List<Book> getAll();
	
	
}
