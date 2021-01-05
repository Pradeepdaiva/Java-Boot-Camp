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

import com.thirdware.librarymngmt.borrower.dao.BorrowerDao;
import com.thirdware.librarymngmt.borrowerdetails.dao.BorrowerDetailsDao;
import com.thirdware.librarymngmt.models.Borrower;
import com.thirdware.librarymngmt.models.BorrowerDetails;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BorrowerController {

	ApplicationContext context = new ClassPathXmlApplicationContext("librarymngmt.xml");
	BorrowerDao borrowerDao = context.getBean(BorrowerDao.class);

	@RequestMapping(value = "/borrower", method = RequestMethod.GET, produces = "application/json")
	public List<Borrower> getBookSection() {
		List<Borrower> list = borrowerDao.getBorrowerDetails();
		return list;
	}

	@PostMapping("/borrower")
	public void addBorrower(@RequestBody Borrower borrower) {

		borrowerDao.borrowerDetails(borrower);
	}

	@DeleteMapping("/borrower/{userId}")
	public void deleteBorrower(@PathVariable int userId) {

		borrowerDao.deleteBorrower(userId);
	}
	
	@PutMapping("/borrower/{userId}")
	public void updateBorrower(@RequestBody Borrower borrower,@PathVariable int userId) {		
		borrowerDao.updateBorrower(userId,borrower);
	}

}
