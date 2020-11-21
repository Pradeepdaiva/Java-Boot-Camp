package com.thirdware.arrayconcept;

public class ArrayDemo {

	public int array(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public void reverse(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}


}

