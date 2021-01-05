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

import com.thirdware.librarymngmt.booksection.dao.BookSectionDao;
import com.thirdware.librarymngmt.models.BookSection;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookSectionController {

	ApplicationContext context = new ClassPathXmlApplicationContext("librarymngmt.xml");
	BookSectionDao bookSectionDao = context.getBean(BookSectionDao.class);

	@RequestMapping(value = "/bookSection", method = RequestMethod.GET, produces = "application/json")
	public List<BookSection> getBookSection() {
		List<BookSection> list = bookSectionDao.getBookSection();
		return list;

	}

	@PostMapping("/bookSection")
	public void addBookSection(@RequestBody BookSection bookSection) {
		bookSectionDao.addBookSection(bookSection);
	}

	@DeleteMapping("/bookSection/{sectionId}")
	public void deleteBookSection(@PathVariable int sectionId) {
		bookSectionDao.deleteBookSection(sectionId);
	}
	
	@PutMapping("/bookSection/{sectionId}")
	public void updateBookSection(@RequestBody BookSection bookSection,@PathVariable int sectionId) {
		bookSectionDao.updateBookSection(sectionId,bookSection);
	}

}
