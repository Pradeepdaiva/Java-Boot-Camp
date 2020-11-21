
package com.thirdware.oopsconceptstask2;

public class TemporaryEmp extends Company{
	int tIncSalary=2000;
	
	public void tIncSalary() {
		System.out.println("The Temporary Employees increment salary: "+ (tSalary+tIncSalary));
	}
}
