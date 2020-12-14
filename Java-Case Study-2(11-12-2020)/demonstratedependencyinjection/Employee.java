package com.thirdware.demonstratedependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("101")
	private int empId;
	@Value("Pradeep")
	private String empName;
	@Autowired
	private Department dept;
	@Autowired
	private AddressOfEmp addr;
	@Autowired
	@Qualifier("addr")
	private Management mgmt;
	public Employee(int empId, String empName, Department dept, AddressOfEmp addr, Management mgmt) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.addr = addr;
		this.mgmt = mgmt;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName +"]";
	}
	public void display() {
		mgmt.management();
	}

	

}
