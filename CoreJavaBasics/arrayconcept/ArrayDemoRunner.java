package com.thirdware.arrayconcept;

public class ArrayDemoRunner {

	public static void main(String[] args) {
		int sum;
		ArrayDemo arr=new ArrayDemo();
		int a[]= {1,2,3,4,5};
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{9,8,7},{6,5,4},{3,2,1}};
		sum=arr.array(a);
		System.out.println("Sum of the array: "+sum);
		System.out.println("Average of the array: "+(sum/a.length));
		arr.reverse(a);
		System.out.println();
		
			int c[][]=new int[3][3];
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					c[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
			System.out.println("Multidimensional Array: ");
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
	}

}
