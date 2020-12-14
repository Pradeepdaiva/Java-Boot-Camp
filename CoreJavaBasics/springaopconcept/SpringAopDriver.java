package com.thirdware.springaopconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopDriver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SimCardService service = (SimCardService) context.getBean("simCardService");
		System.out.println(service.getPostpaid().getName());

	}

}
