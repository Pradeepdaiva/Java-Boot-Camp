package com.thirdware.objectcasting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		int n=97;
		char a='A';
		float f=6.5f;
		double d=2.50;
		short sh=100;
		String s="100";
		System.out.println("<-----Implicit TypeCasting----->");
		System.out.println("Double to Float: "+(float)d);
		System.out.println("Float to Int: "+(int)f);
		System.out.println("Int to Char: "+(char)n);
		System.out.println("Char to Short: "+(short)a);
		System.out.println("<-----Explicit TypeCasting----->");
		System.out.println("Short to Char: "+(char)sh);
		System.out.println("Char to Int : "+(int)a);
		System.out.println("Int to Float: "+(float)n);
		System.out.println("Float to Double: "+(double)f);
		
		System.out.println("String to Int: "+Integer.valueOf(s));

	}

}
