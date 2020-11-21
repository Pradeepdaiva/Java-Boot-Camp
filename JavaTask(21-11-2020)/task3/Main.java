package com.thirdware.task2;

class MyBook extends Book {

	@Override
	void setTitle(String s) {
		title=s;
	}

}
public class Main{
	public static void main(String[] args) {
		MyBook mybook=new MyBook();
		mybook.setTitle("A tale of two cities");
		System.out.println("The title is: "+mybook.getTitle());
	}
}
