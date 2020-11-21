package com.thirdware.oopsconceptstask2;

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		PermanentEmp per=new PermanentEmp();
		per.pSalary();
		per.pIncSalary();
		TemporaryEmp temp=new TemporaryEmp();
		temp.tSalary();
		temp.tIncSalary();
		

	}

}
