package com.thirdware.librarymngmt.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thirdware.librarymngmt.models.UserRegistry;
import com.thirdware.librarymngmt.userregistry.dao.UserRegistryDao;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserRegistryController {

	ApplicationContext context = new ClassPathXmlApplicationContext("librarymngmt.xml");
	UserRegistryDao userRegistryDao = context.getBean(UserRegistryDao.class);

	@RequestMapping(value = "/userRegistry", method = RequestMethod.GET, produces = "application/json")
	public List<UserRegistry> getUserDetails() {
		List<UserRegistry> list = userRegistryDao.getUserRegistry();
		return list;
	}
	
	@PostMapping("/userRegistry")
	public void addUser(@RequestBody UserRegistry userRegistry) {
		userRegistryDao.addUser(userRegistry);
	}
}
