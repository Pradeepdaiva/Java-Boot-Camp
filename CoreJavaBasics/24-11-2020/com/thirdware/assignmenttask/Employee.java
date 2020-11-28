package com.thirdware.assignmenttask;

public class Employee extends PersonalInfo {
	private String name;
	public double monthlySalary;
	Department dept;
	EmployeeFinancials emp_financial = new EmployeeFinancials();
	public double updatedSalary;
	public double tax;

	public Employee(int id, String name, char gender, String address, String phone, double monthlySalary, int deptCode,
			String deptName) {
		super(id, gender, address, phone);
		this.setName(name);
		this.monthlySalary = monthlySalary;
//		System.out.println(monthlySalary);
		this.dept = new Department(deptCode, deptName);
//		System.out.println(emp_financial.updatedAnnualSalary(monthlySalary));
		this.updatedSalary = emp_financial.updatedAnnualSalary(monthlySalary);
		this.tax = emp_financial.tax(monthlySalary, gender);
	}

	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", monthlySalary=" + monthlySalary + ", " + dept + ", "
				+ super.toString() + "]";
	}

	public String updateToSalary() {
		// TODO Auto-generated method stub
		return "Employee [name=" + getName() + ", monthlySalary=" + monthlySalary + ", " + dept
				+ ", updatedAnnualSalary=" + updatedSalary + "]";
	}

	public String taxtoString() {
		return "Employee [name=" + getName() + ", monthlySalary=" + monthlySalary + ", dept=" + dept
				+ ", updatedAnnualSalary=" + updatedSalary + ",Tax" + tax + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
