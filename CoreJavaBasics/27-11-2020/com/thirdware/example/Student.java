package com.thirdware.example;

public class Student {
	int id,age;
	String name,street;
	public Student(int id, String name,int age , String address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.street = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", address=" + street + "]";
	}
	
	
}
