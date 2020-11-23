package com.thirdware.exceptionhandling;

//import java.util.Scanner;

public class Sample {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try {
			//Scanner sc=new Scanner(System.in);
			String str="pradeep";
	        if(str==null) {
				throw new Check("Written Nothing");
			} 
	        System.out.println("String Length: "+str.length());
		}
		catch(Exception c) {
			System.out.println(c.getMessage());
		}
		finally{
		     System.out.println("Task Done");
		}
	}

}

