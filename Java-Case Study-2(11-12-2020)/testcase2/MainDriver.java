package com.thirdware.testcase2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ListOfStudent.xml");
		MakingList list = (MakingList) context.getBean("makingList");
		list.display();

	}

}
