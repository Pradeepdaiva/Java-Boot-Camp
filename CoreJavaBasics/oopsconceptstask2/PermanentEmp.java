package com.thirdware.oopsconceptstask2;

public class PermanentEmp extends Company{
	int pIncSalary=5000;
	
	public void pIncSalary() {
		System.out.println("The permanent Employees increment salary: "+ (pSalary+pIncSalary));
	}

}
