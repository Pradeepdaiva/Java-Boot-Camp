package com.thirdware.exceptionhandling;

public class BuiltInException {

	public void arithmetricExp() {
		try {
			int a=4/2;            //(a=4/0) ArithmeticException  
			System.out.println(a);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

	public void nullPointerExp() {
		try {
			String s="pradeep";    //s=null NullPointerException
			System.out.println(s.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
	}

	public void arrayIndexExp() {
		try {
			String s[]={"pradeep","kumar","naveen"};  //s[5] ArrayIndexOutOfBoundsException
			System.out.println(s[0]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public void numberFormatExp() {
		try {
			int num=Integer.parseInt("10");  //int num=Integer.parseInt("ppk")  NumberFormatException
			System.out.println(num);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
	}

	public void stringIndexExp() {
		try {
			String s="Welcome to Exception";
			System.out.println(s.charAt(5));  //s.charAt(50) StringIndexOutOfBoundsException
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

	public void negativeArrayExp() {
		try{
			int a[]=new int[-10];            //int a[]=new int[-5]  NegativeArraySizeException
		}catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
