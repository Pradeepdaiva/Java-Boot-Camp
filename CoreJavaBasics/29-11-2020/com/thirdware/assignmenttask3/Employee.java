package com.thirdware.assignmenttask3;

import java.util.List;

public class Employee {
	private String emp_Id, emp_Name, department, manager_Emp_Id;
	int experience_in_year, gross_Salary;

	public String getEmp_Id() {
		return emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public String getDepartment() {
		return department;
	}

	public String getManager_Emp_Id() {

		return manager_Emp_Id;
	}

	public int getGross_Salary() {
		return gross_Salary;
	}

	public int getExperience_in_year() {

		return experience_in_year;
	}

	public Employee(String emp_Id, String emp_Name, String department, String manager_Emp_Id, int gross_Salary,
			int experience_in_year) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.department = department;
		this.manager_Emp_Id = manager_Emp_Id;
		this.gross_Salary = gross_Salary;
		this.experience_in_year = experience_in_year;
	}

	EmployeeUpdates fileread = new EmployeeUpdates();

	public void getManager(Employee emp) {
		List<Employee> list = fileread.get();
		int flag = 0;
		for (Employee ex : list) {
			if (emp.getManager_Emp_Id().equalsIgnoreCase(ex.emp_Id)) {
				emp.manager_Emp_Id = ex.emp_Name;
				flag = 1;
			}

		}
		if (flag == 0) {
			emp.manager_Emp_Id = "NONE";
		}

	}

	public void setManager_Emp_Id(String manager_Emp_Id) {
		this.manager_Emp_Id = manager_Emp_Id;
	}

	@Override
	public String toString() {
		return "Employee ID:" + emp_Id + ", Name:" + emp_Name + ", Department:" + department + ", Manager:"
				+ manager_Emp_Id + ", Gross Salary:" + gross_Salary + ", Experiance:" + experience_in_year;
	}

}
