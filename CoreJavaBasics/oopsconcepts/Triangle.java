package com.thirdware.oopsconcepts;

public class Triangle implements Shape {

	public void tarea() {
		System.out.println("Area of Triangle: " + (h * b) / 2);
	}

	public void tperimeter() {
		System.out.println("Perimeter of Triangle: " + ((2 * a) + b));
	}

	@Override
	public void shape() {
		System.out.println("Area and perimeter of the Triangle:");

	}
}
