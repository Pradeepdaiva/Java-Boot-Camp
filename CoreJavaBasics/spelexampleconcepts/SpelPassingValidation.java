package com.thirdware.spelexampleconcepts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelPassingValidation {
	
	@Value("Pradeep")
	private String name;
	

}
