package com.thirdware.librarymngmt.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thirdware.librarymngmt.borrowerdetails.dao.BorrowerDetailsDao;
import com.thirdware.librarymngmt.models.BorrowerDetails;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BorrowerDetailsController {

	ApplicationContext context = new ClassPathXmlApplicationContext("librarymngmt.xml");
	BorrowerDetailsDao borrowerDetailsDao = context.getBean(BorrowerDetailsDao.class);

	@RequestMapping(value = "/borrowerDetails", method = RequestMethod.GET, produces = "application/json")
	public List<BorrowerDetails> getBookSection() {
		List<BorrowerDetails> list = borrowerDetailsDao.getBorrowerDetails();
		return list;
	}

	@PostMapping("/borrowerDetails")
	public void addBorrower(@RequestBody BorrowerDetails borrower) {

		borrowerDetailsDao.borrowerDetails(borrower);
	}

	@DeleteMapping("/borrowerDetails/{userId}")
	public void deleteBorrower(@PathVariable int userId) {

		borrowerDetailsDao.deleteBorrower(userId);
	}

}
