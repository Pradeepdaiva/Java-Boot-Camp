package com.thirdware.conditionalstatement;

public class SwitchStatement {
	int a, b, ch;

	public SwitchStatement(int a, int b, int ch) {
		this.a = a;
		this.b = b;
		this.ch = ch;

	}

	public int operation() {
		int c = 0;
		switch (ch) {
		case 1:
			c = a + b;
			break;
		case 2:
			c = b - a;
			break;
		case 3:
			c = a * b;
			break;
		case 4:
			c = a / b;
			break;
		default:
			System.out.println("Enter the value 1 to 4");
		}
		return c;

	}

}
