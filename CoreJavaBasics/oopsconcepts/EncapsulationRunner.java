package com.thirdware.oopsconcepts;

public class EncapsulationRunner {

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.setA(10);
		obj.setB(20);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		obj.unary();
		obj.shift();
		obj.arithmetric();
		obj.relational();
		obj.logical();
		obj.bitwise();
		obj.ternary();
		obj.assignment();
	}

}
