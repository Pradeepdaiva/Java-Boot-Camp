package com.thirdware.demonstratedependencyinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department implements Management {
	
	@Value("Dev01")
	private String deptId;
	@Value("Developer")
	private String deptName;
	
	

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void display() {
		System.out.println("Department method Runner");
	}

	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

	@Override
	public void management() {
		System.out.println("Department details of Employee");
		System.out.println("deptId=" + deptId + ", deptName=" + deptName );
		
	}
	

}
