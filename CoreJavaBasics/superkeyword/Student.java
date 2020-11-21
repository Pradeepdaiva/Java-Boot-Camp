package com.thirdware.superkeyword;

public class Student extends Teacher {
	String studName="Ragul";
	public static int age=10; 
	static {
		System.out.println("Welcome to School");
	}
	Student(){
		super();
		System.out.println("Good morning teacher");
	}
	public void details() {
		super.reply();
		System.out.println("Teacher Name: "+super.name);
		System.out.println("Class and Section: "+super.cls_sec);
		System.out.println("Student Name: "+this.studName);
		System.out.println("Student age: "+age);
	}
}
