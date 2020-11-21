package com.thirdware.oopsconcepts;

public class ListOfOperators {

	public static void main(String[] args) {
		int x = 20, y = 30;
		boolean b = false;

		// Unary Operator
		System.out.println("PostIncrement: " + x++);// 20
		System.out.println("PreIncrement: " + ++x);// 22
		System.out.println("PostDecrement: " + y--);// 30
		System.out.println("PreDecrement: " + --y);// 28
		System.out.println("Complement: " + ~x);// -23
		System.out.println("Opposite: " + !b);// true

		// Shift
		System.out.println("Left Shift: " + (x << 2));// x*2^2=22*4=88
		System.out.println("Right Shift: " + (y >> 2));// y/2^2=28/4=7

		// Arithmetic Operator
		System.out.println("Addition: " + (x + y));// 50
		System.out.println("Subtraction: " + (x - y));// -6
		System.out.println("Multiplication: " + (x * y));// 616
		System.out.println("Division: " + (x / y));// 0
		System.out.println("Modulus: " + (x % y));// 22

		// Relational Operator
		System.out.println("Lesser than: " + (x < y));// true
		System.out.println("Greater than: " + (x > y));// false
		System.out.println("Lesser than equal: " + (x <= y));// true
		System.out.println("Greater than equal: " + (x >= y));// false
		System.out.println("Equal: " + (x == y));// false
		System.out.println("Not Equal: " + (x != y));// true

		// Logical Operator
		System.out.println("Logical AND :" + ((x == y) && (x != y)));// false
		System.out.println("Logical OR :" + ((x == y) || (x != y)));// true

		// Bitwise Operator
		System.out.println("Bitwise AND :" + ((x == y) & (x != y)));// false
		System.out.println("Bitwise OR :" + ((x == y) | (x != y)));// true
		System.out.println("Bitwise exclusive OR: " + ((x != y) ^ (x != y)));// false

		// Ternary Operator
		System.out.println("Ternary :" + ((x != y) ? true : false));// true

		// Assignment Operator
		x = 5;
		y = 10;
		System.out.println(x);// x=5
		System.out.println(y);// y=10
		System.out.printf("%d\n", x += 10);// x=x+10=15
		System.out.printf("%d\n", y -= 5);// y=y-5=5
		System.out.printf("%d\n", x *= 10);// x=x*10=150
		System.out.printf("%d\n", y /= 5);// y=y/5=1
		System.out.printf("%d\n", x %= 100);// x=x%100=50
		System.out.printf("%d\n", y %= 100);// y=y%100=1

	}

}
