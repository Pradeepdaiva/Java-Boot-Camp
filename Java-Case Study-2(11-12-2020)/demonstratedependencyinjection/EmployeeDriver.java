package com.thirdware.demonstratedependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp=(Employee) context.getBean("employee");
		System.out.println(emp);
		emp.display();
	}

}
