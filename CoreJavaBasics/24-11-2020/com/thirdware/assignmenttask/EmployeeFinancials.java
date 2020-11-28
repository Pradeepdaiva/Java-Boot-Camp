package com.thirdware.assignmenttask;

public class EmployeeFinancials {
	public double updatedAnnualSalary(double monthlySalary) {
		double updatedSalary=(((monthlySalary*12)/100)*5)+(monthlySalary*12);
		return updatedSalary;
	}
	
	public double tax(double monthlySalary,char gender) {
		double tax=0;
		if(gender=='M') {
			tax=((monthlySalary*12)/100)*10;
		}else if(gender=='F') {
			tax=((monthlySalary*12)/100)*5;
		}
		return tax;
	}

}
