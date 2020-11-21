package com.thirdware.conditionalstatement;

public class SwitchStatementRunner {

	public static void main(String[] args) {
		SwitchStatement s = new SwitchStatement(10, 20, 5);
		int num=s.operation();
		System.out.println("Result: "+num);
		
	}

}
