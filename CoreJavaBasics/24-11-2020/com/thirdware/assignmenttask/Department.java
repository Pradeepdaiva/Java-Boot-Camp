package com.thirdware.assignmenttask;

public class Department {

	private int deptCode;
	private String deptName;

	public Department(int deptCode, String deptName) {
		
		this.deptCode = deptCode;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptCode=" + deptCode + ", deptName=" + deptName + "]";
	}

}
