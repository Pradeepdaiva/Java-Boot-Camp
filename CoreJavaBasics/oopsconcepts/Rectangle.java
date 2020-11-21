package com.thirdware.oopsconcepts;

public class Rectangle implements Shape{
	
	public void rarea() {
		System.out.println("Area of Rectangle: "+ (l*w));
	}
	public void rperimeter() {
		System.out.println("Perimeter of Rectangle: "+ 2*(l+w));
	}
	@Override
	public void shape() {
		System.out.println("Area and perimeter of the Rectangle:");
		
		
	}

}
