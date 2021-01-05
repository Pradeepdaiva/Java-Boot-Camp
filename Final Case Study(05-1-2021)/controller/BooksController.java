package com.thirdware.librarymngmt.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thirdware.librarymngmt.books.dao.BooksDao;
import com.thirdware.librarymngmt.models.Books;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BooksController {

	ApplicationContext context = new ClassPathXmlApplicationContext("librarymngmt.xml");
	BooksDao booksDao = context.getBean(BooksDao.class);

	@RequestMapping(value = "/books", method = RequestMethod.GET, produces = "application/json")
	public List<Books> getBookSection() {
		List<Books> list = booksDao.getBooksList();
		return list;

	}
	
	@PostMapping("/books")
	public void addBooks(@RequestBody Books book) {
		booksDao.addBooks(book);
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable int bookId) {
		booksDao.deleteBook(bookId);
	}
	
	@PutMapping("/books/{bookId}")
	public void updateBook(@RequestBody Books book,@PathVariable int bookId) {
		booksDao.updateBooks(bookId, book);
	}

}
