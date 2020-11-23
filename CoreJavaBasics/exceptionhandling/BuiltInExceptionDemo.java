package com.thirdware.exceptionhandling;

public class BuiltInExceptionDemo {
	public static void main(String[] args) {
		BuiltInException built = new BuiltInException();
		built.arithmetricExp();
		built.nullPointerExp();
		built.arrayIndexExp();
		built.numberFormatExp();
		built.stringIndexExp();
		built.negativeArrayExp();

	}
}
