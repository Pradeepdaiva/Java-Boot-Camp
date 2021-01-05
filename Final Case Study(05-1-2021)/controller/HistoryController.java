package com.thirdware.librarymngmt.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thirdware.librarymngmt.history.dao.HistoryDao;
import com.thirdware.librarymngmt.models.History;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HistoryController {

	ApplicationContext context = new ClassPathXmlApplicationContext("librarymngmt.xml");
	HistoryDao historyDao = context.getBean(HistoryDao.class);

	@RequestMapping(value = "/history", method = RequestMethod.GET, produces = "application/json")
	public List<History> getHistory() {
		List<History> list = historyDao.getHistory();
		return list;
	}

}
