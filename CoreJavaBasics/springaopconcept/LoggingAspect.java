package com.thirdware.springaopconcept;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Component
@Aspect
public class LoggingAspect {
	
	@Before("execution(public String  getName())")
	public void message() {
		System.out.println("Get Method call");
	}

}
