package com.thirdware.objectcasting;

public class Boxing {

	public static void main(String[] args) {
		Integer num=25; //Auto Boxing
		Character ch='A'; //Auto Boxing
		int a=num; //unboxing
		char c=ch;//unboxing
		
		System.out.println(a);
		System.out.println(c);

	}

}
