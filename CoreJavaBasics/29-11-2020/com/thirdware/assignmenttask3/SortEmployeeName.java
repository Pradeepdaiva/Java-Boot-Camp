package com.thirdware.assignmenttask3;

import java.util.Comparator;

public class SortEmployeeName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEmp_Name().compareTo(e2.getEmp_Name());
	}

}
class SortEmployeeId implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getEmp_Id().compareTo(e2.getEmp_Id());
	}
	
}
class SortEmployeeDept implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
	
}
class SortEmployeeManager implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getManager_Emp_Id().compareTo(e2.getManager_Emp_Id());
	}
	
}
class SortEmployeeSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getManager_Emp_Id().compareTo(e2.getManager_Emp_Id());
	}
	
}
class SortEmployeeYear implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getManager_Emp_Id().compareTo(e2.getManager_Emp_Id());
	}
	
}