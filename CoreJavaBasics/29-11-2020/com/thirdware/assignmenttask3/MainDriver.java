package com.thirdware.assignmenttask3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		EmployeeUpdates filereader = new EmployeeUpdates();
		FileWriterDriver fileWriter = new FileWriterDriver();
		UpdateWriterDriver updateWriter = new UpdateWriterDriver();

		System.out.println("<-----------Assignment Task-------------->");
		System.out.println("1.Display the Employee using to string");
		System.out.println("2.Display Total salary for each department");
		System.out.println("3.Display Eligible Employee list using criteria");
		System.out.println("4.Sort the list and update to file");
		System.out.println("5.Change the manager of Sundar Ramanujam");
		System.out.println("6.Delete Employee using employee Id");

		System.out.println("Enter your choice {1-6]:");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			List<Employee> list = new ArrayList<>();
			filereader.reader();
			list = filereader.get();
			for (Employee emp : list)
				System.out.println(emp);
			break;
		case 2:
			String str[] = { "NULL", "Sales", "Marketing", "IT" };
			while (true) {
				System.out.println("Select the department[1-3]:");
				System.out.println("1.Sales");
				System.out.println("2.Marketing");
				System.out.println("3.IT");
				System.out.println("Enter the choice[1-3]:");
				int i = scan.nextInt();
				if (i <= 0 || i >= 4) {
					continue;
				} else {
					filereader.reader();
					filereader.getTotalSalaryForDepartment(str[i]);
					break;
				}
			}
			break;

		case 3:
			System.out.println("Display Eligible Employee list using criteria:");
			System.out.println("1.Experiance");
			System.out.println("2.Salary");
			int i = scan.nextInt();
			if (i == 1) {
				while (true) {
					String s1[] = { "NULL", "Sales", "Marketing", "IT" };
					System.out.println("Select the Department[1-3]:");
					System.out.println("1.Sales");
					System.out.println("2.Marketing");
					System.out.println("3.IT");
					System.out.println("Enter the choice[1-3]:");
					int n = scan.nextInt();
					if (n <= 0 || n >= 4) {
						continue;
					}
					System.out.println("Enter the  experiance");
					int e = scan.nextInt();
					updateWriter.getEligibleEmployee(s1[n], e);
					break;
				}
			}
			if (i == 2) {
				while (true) {
					String s1[] = { "Sales", "Marketing", "IT" };
					System.out.println("Select the Department[1-3]:");
					System.out.println("1.Sales");
					System.out.println("2.Marketing");
					System.out.println("3.IT");
					System.out.println("Enter the choice[1-3]:");
					int n = scan.nextInt();
					if (n <= 0 || n >= 4) {
						continue;
					}
					System.out.println("Enter the  Salary");
					long e = scan.nextLong();
					updateWriter.getEligibleEmployee(s1[n - 1], e);
					break;
				}
			}

			break;
		case 4:
			fileWriter.writer("C:\\Users\\bcp\\SortedEmployees.csv");
			break;
		case 5:
			updateWriter.changeManagerOf("Sundar Ramanujam");
			break;
		case 6:
			System.out.println("Enter the Employee ID:");
			String s = scan.next();
			updateWriter.deleteEmployee(s);
			break;
		default:
			System.out.println("Enter the value [1-5]");
		}

		scan.close();
	}

}
