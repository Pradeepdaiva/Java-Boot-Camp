package com.thirdware.loopingstatement;

public class LoopStatementDemo {

	public static void main(String[] args) {
		LoopStatement l = new LoopStatement(2);
		l.whileLoop();
		System.out.println();
		l.forLoop(121);
		System.out.println();
		l.pattern(5, 10);

	}

}
