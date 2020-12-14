package com.thirdware.demonstratedependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	
	@Bean
	public Employee employee(){
		return new Employee();
	}
	
	@Bean
	public Department dept() {
		return new Department();
	}
	
	@Bean
	public AddressOfEmp addr() {
		return new AddressOfEmp();
	}
	
}
