package com.thirdware.threadconcept;

import java.util.Scanner;

public class CounterDriver {

	public static void main(String[] args) throws Exception
	{
		Counter count =new Counter();
		
		System.out.println("To stop Press Enter");
		count.start();
		
		@SuppressWarnings("resource")
		Scanner scanner =  new Scanner(System.in);
		scanner.nextLine();
		
		count.stopCounting();
		

	}

}
