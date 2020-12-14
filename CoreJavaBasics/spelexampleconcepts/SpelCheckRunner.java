package com.thirdware.spelexampleconcepts;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpelCheckRunner {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
	    ValidationSpel v=(ValidationSpel) context.getBean("validate");
	    
	    //SpelPassingValidation spel=(SpelPassingValidation) context.getBean("spelpassing");
		System.out.println(v);

	}

}
