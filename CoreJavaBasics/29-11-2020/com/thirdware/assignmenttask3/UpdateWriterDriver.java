package com.thirdware.assignmenttask3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UpdateWriterDriver {
Employee emp;
 static List<Employee> list = new ArrayList<>();
       EmployeeUpdates fileread = new EmployeeUpdates();
       
	public void deleteEmployee(String emp_id) throws IOException {
		String str = null;
		Employee e = null;
		fileread.reader();
		list=fileread.get();
		for(Employee emp:list) {
			if(emp_id.equalsIgnoreCase(emp.getEmp_Id())) {
				str=emp.getEmp_Name();
				System.out.println(str);
				e=emp;
			}
		}
		list.remove(e);
		for(Employee emp:list) {
			if(str.equalsIgnoreCase(emp.getManager_Emp_Id())) {
				emp.setManager_Emp_Id("NULL");
			}
		}
		for(Employee emp:list) {
			System.out.println(emp);
		}
		FileWriter writer = new FileWriter("C:\\\\\\\\Users\\\\\\\\bcp\\\\\\\\Employees.csv");
		writer.append("Employee Id,");
		writer.append("Employee Name,");
		writer.append("Department,");
		writer.append("ManagerName,");
		writer.append("Gross_Salary [In INR],");
		writer.append("Experiance_in_year");
		writer.append("\n");

		for (Employee emp : list) {
			writer.append(emp.getEmp_Id());
			writer.append(",");
			writer.append(emp.getEmp_Name());
			writer.append(",");
			writer.append(emp.getDepartment());
			writer.append(",");
			writer.append(emp.getManager_Emp_Id());
			writer.append(",");
			writer.append(String.valueOf(emp.getGross_Salary()));
			writer.append(",");
			writer.append(String.valueOf(emp.getExperience_in_year()));
			writer.append(",");
			writer.append("\n");
		}
		writer.flush();
		writer.close();
		System.out.println("Successfully updated....");
	}
	public  void changeManagerOf(String emp_name) throws IOException {
		fileread.reader();
		list=fileread.get();
		for(Employee emp:list) {
			if(emp_name.equalsIgnoreCase(emp.getEmp_Name())) {
				emp.setManager_Emp_Id("Anshuman Gupta");
			}
		}
		for(Employee emp:list) {
			System.out.println(emp);
		}
		FileWriter writer = new FileWriter("C:\\\\\\\\Users\\\\\\\\bcp\\\\\\\\Employees.csv");
		writer.append("Employee Id,");
		writer.append("Employee Name,");
		writer.append("Department,");
		writer.append("ManagerName,");
		writer.append("Gross_Salary [In INR],");
		writer.append("Experiance_in_year");
		writer.append("\n");

		for (Employee emp : list) {
			writer.append(emp.getEmp_Id());
			writer.append(",");
			writer.append(emp.getEmp_Name());
			writer.append(",");
			writer.append(emp.getDepartment());
			writer.append(",");
			writer.append(emp.getManager_Emp_Id());
			writer.append(",");
			writer.append(String.valueOf(emp.getGross_Salary()));
			writer.append(",");
			writer.append(String.valueOf(emp.getExperience_in_year()));
			writer.append(",");
			writer.append("\n");
		}
		writer.flush();
		writer.close();
		System.out.println("Successfully updated....");
	}

	public void getEligibleEmployee(String dept_name, int noOfYear) throws IOException {
		fileread.reader();
		list=fileread.get();
		for(Employee emp:list) {
			if(dept_name.equalsIgnoreCase(emp.getDepartment()) && emp.getExperience_in_year()>=noOfYear) {
				System.out.println(emp);
			}
		}
		
	}
	public void getEligibleEmployee(String dept_name, long salary) throws IOException {
		fileread.reader();
		list=fileread.get();
		for(Employee emp:list) {
			if(dept_name.equalsIgnoreCase(emp.getDepartment()) && emp.getGross_Salary()>=salary) {
				System.out.println(emp);
			}
		}
		
	}
		
	}


