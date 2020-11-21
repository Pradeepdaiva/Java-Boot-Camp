package com.thirdware.oopsconcepts;

public class Encapsulation {
	private int a, b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void unary() {
		System.out.println("PostIncrement: " + a++);// 10
		System.out.println("PreIncrement: " + ++a);// 12
		System.out.println("PostDecrement: " + b--);// 20
		System.out.println("PreDecrement: " + --b);// 18
		System.out.println("Complement: " + ~a);// -13
	}

	public void shift() {
		System.out.println("Left Shift: " + (a << 2));// x*2^2=12*4=48
		System.out.println("Right Shift: " + (b >> 2));// y/2^2=18/4=4
	}

	public void arithmetric() {
		System.out.println("Addition: " + (a + b));// 30
		System.out.println("Subtraction: " + (a - b));// -6
		System.out.println("Multiplication: " + (a * b));// 216
		System.out.println("Division: " + (a / b));// 0
		System.out.println("Modulus: " + (a % b));// 12
	}

	public void relational() {
		System.out.println("Lesser than: " + (a < b));// true
		System.out.println("Greater than: " + (a > b));// false
		System.out.println("Lesser than equal: " + (a <= b));// true
		System.out.println("Greater than equal: " + (a >= b));// false
		System.out.println("Equal: " + (a == b));// false
		System.out.println("Not Equal: " + (a != b));// true
	}

	public void logical() {
		System.out.println("Logical AND :" + ((a == b) && (a != b)));// false
		System.out.println("Logical OR :" + ((a == b) || (a != b)));// true
	}

	public void bitwise() {
		System.out.println("Bitwise AND :" + ((a == b) & (a != b)));// false
		System.out.println("Bitwise OR :" + ((a == b) | (a != b)));// true
		System.out.println("Bitwise exclusive OR: " + ((a != b) ^ (a != b)));// false
	}

	public void ternary() {
		System.out.println("Ternary :" + ((a != b) ? true : false));// true
	}
	public void assignment() {
		a = 5;
		b = 10;
		System.out.println(a);// a=5
		System.out.println(b);// b=10
		System.out.printf("%d\n", a += 10);// a=a+10=15
		System.out.printf("%d\n", b -= 5);// b=b-5=5
		System.out.printf("%d\n", a *= 10);// a=a*10=150
		System.out.printf("%d\n", b /= 5);// b=b/5=1
		System.out.printf("%d\n", a %= 100);// a=a%100=50
		System.out.printf("%d\n", b %= 100);// b=b%100=1
	}

}
