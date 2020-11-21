package com.thirdware.conditionalstatement;

public class ConditionStatement {
	int a;

	public ConditionStatement(int a){
		this.a=a;
		
	}
	public void view() {
	if(a<=10 && a>=1 )
	{
		System.out.println("Given condition is true");
		
	}
	if(a>=1)
	{
		System.out.println("Given number is positive");
	}else
	{
		System.out.println("Given number is negative or Zero");
	}

	if(a<=10 && a>=1)
	{
		if (a % 2 == 0) {
			System.out.println("Given number is even ");
		} else {
			System.out.println("Given number is odd");
		}

	}
	}

}
