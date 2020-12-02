package com.thirdware.assignmenttask3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeUpdates {
	static List<Employee> list;
	static Employee emp;

	public void reader() throws IOException {
		String file = "C:\\Users\\bcp\\Employees.csv";
		String delimiter = ",";
		String line;
		list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			@SuppressWarnings("unused")
			String header = br.readLine();
			while ((line = br.readLine()) != null) {
				// line=br.readLine();
				String[] str = line.split(delimiter);
				Employee emp = createList(str);
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Employee emp : list) {
			emp.getManager(emp);
		}
	}

	public void getTotalSalaryForDepartment(String str) {
		int salary = 0;
		for (Employee emp : list) {
			if (str.equalsIgnoreCase(emp.getDepartment())) {
				salary += emp.getGross_Salary();
			}
		}
		System.out.println("Total salary for " + str.toUpperCase() + " department: " + salary);
	}

	public List<Employee> get() {
		return list;

	}

	private static Employee createList(String[] str) {
		String emp_Id = str[0];
		String emp_Name = str[1];
		String department = str[2];
		String manager_Emp_Id = str[3];
		int gross_Salary = Integer.valueOf(str[4]);
		int experience_in_year = Integer.valueOf(str[5]);
		return new Employee(emp_Id, emp_Name, department, manager_Emp_Id, gross_Salary, experience_in_year);
	}

}
