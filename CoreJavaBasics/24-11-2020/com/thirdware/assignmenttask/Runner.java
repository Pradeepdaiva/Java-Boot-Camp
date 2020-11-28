package com.thirdware.assignmenttask;

public class Runner {

	public static void main(String[] args) {
            add();
            display();
		Employee emp1 = new Employee(1, "pradeep", 'M', "chennai", "9894305236", 30000, 25, "Developer");
		
		Employee emp2 = new Employee(2, "Devi", 'F', "Maduri", "9000250405", 30000, 15, "Tester");
		System.out.println(emp1);
		System.out.println(emp2.updateToSalary());
		System.out.println(emp2.taxtoString());

	}

	private static void display() {
//	Employee emp1 ;
//		System.out.println(emp1.getName());
//		System.out.println(emp1.updateToSalary());
//		System.out.println(emp1.taxtoString());
		
	}

	private static void add() {
		int id=3;
		String name="pradeep";
		char c='M';
		String address="chennai";
		String phone="302423443";
		double Salary=30000;
		int deptcode=25;
		String deptName="Developer";
				
		
		Employee emp1=new Employee(id,name, c,address,phone,Salary,deptcode,deptName);
	}

}
