package com.thirdware.oopsconceptstask2;

public class Employee {
	private int empId;
	private String empName;
	private String company;
	
	Employee(int id,String name,String cmp){
		empId=id;
		empName=name;
		company=cmp;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", company=" + company + "]";
	}
	

}
