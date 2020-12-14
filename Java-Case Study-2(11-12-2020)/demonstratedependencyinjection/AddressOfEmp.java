package com.thirdware.demonstratedependencyinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressOfEmp implements Management {
	@Value("Chennai")
	private String location;
	@Value("Tamil Nadu")
	private String state;
	

	public AddressOfEmp(String location, String state) {
		super();
		this.location = location;
		this.state = state;
	}

	public AddressOfEmp() {
		// TODO Auto-generated constructor stub
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressOfEmp [location=" + location + ", state=" + state + "]";
	}

	@Override
	public void management() {
		System.out.println("Address of Employee: ");
		System.out.println("location=" + location + ", state=" + state );

	}

}
