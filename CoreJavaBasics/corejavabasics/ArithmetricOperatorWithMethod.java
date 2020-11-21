package com.thirdware.corejavabasics;

public class ArithmetricOperatorWithMethod {
	static int a = 10, b = 20;

	public static void main(String[] args) {
		ArithmetricOperatorWithMethod aom = new ArithmetricOperatorWithMethod();
		aom.add();
		aom.sub();
		aom.mul();
		aom.div();
		aom.mod();
	}

	public void add() {
		System.out.println("Addition: " + (a + b));
	}

	public void sub() {
		System.out.println("Subtraction: " + (a - b));
	}

	public void mul() {
		System.out.println("Multiplication: " + (a * b));
	}

	public void div() {
		System.out.println("Division: " + (a / b));
	}

	public void mod() {
		System.out.println("Modulus: " + (a % b));
	}
}
