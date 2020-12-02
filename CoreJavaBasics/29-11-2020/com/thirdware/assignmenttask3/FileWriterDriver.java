package com.thirdware.assignmenttask3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileWriterDriver {

	public void writer(String path) throws IOException {
		Scanner scan=new Scanner(System.in);
		EmployeeUpdates fileread = new EmployeeUpdates();
		List<Employee> list = new ArrayList<>();
		fileread.reader();
		list = fileread.get();
		System.out.println("Select the column name to sort:");
		System.out.println("1.Name");
		System.out.println("2.Id");
		System.out.println("3.Department");
		System.out.println("4.Manager");
		System.out.println("5.Salary");
		System.out.println("6.Experience");
		System.out.println("Enter your choice[1-6]");
		int  choice=scan.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(list, new SortEmployeeName());
			break;
		case 2:
			Collections.sort(list, new SortEmployeeId());
			break;
		case 3:
			Collections.sort(list, new SortEmployeeDept());
			break;
		case 4:
			Collections.sort(list, new SortEmployeeManager());
			break;
		case 5:
			Collections.sort(list, new SortEmployeeSalary());
			break;
		case 6:
			Collections.sort(list, new SortEmployeeYear());
			break;
		default:
			System.out.println("select the correct value:");
		}
		scan.close();
		FileWriter writer = new FileWriter(path);
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
		System.out.println("Successfully sorted.......");
	}

}
