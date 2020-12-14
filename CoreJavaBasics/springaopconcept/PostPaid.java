package com.thirdware.springaopconcept;

import org.springframework.stereotype.Component;

@Component
public class PostPaid {
	
	private String name="Pradeep";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
