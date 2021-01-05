package com.thirdware.librarymngmt.maindriverclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.thirdware.librarymngmt.controller"})
public class LibraryManagementMainDriver {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LibraryManagementMainDriver.class, args);
	}

}
