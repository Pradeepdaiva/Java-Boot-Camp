package com.thirdware.spelexampleconcepts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.thirdware.spelexampleconcepts")
public class Myconfig {
	@Bean(value="validate")
	public ValidationSpel validate() {
		
		return new ValidationSpel();
	}
	
	@Bean(value="spelpassing")
	public SpelPassingValidation spelpassing() {
		
		return new SpelPassingValidation();
	}

}
