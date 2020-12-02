package com.thirdware.threadconcept;

public class TestSleepMethod extends Thread {

	public static void main(String[] args) {

		TestSleepMethod test = new TestSleepMethod();
		test.start();
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
