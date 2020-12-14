package com.thirdware.springjdbcconnector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.DemoApplication;

@SpringBootApplication
public class PersonMainDriver {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(PersonMainDriver.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
		PersonDAOImpl personDao = context.getBean(PersonDAOImpl.class);
		System.out.println(personDao.getPersonList());
	}

}
