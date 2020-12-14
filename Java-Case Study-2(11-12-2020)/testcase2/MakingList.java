package com.thirdware.testcase2;

import java.util.List;

public class MakingList {

	private List<Student> list;

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public void display() {
		List<Student> list1 = getList();
		System.out.println("<------------------Students Score card:------------------->");
		for (Student s : list1) {
			System.out.println("StudentId: " + s.getStudentId() + ", " + "StudentName: " + s.getStudentName() + ", "
					+ s.getCourse() + ", " + "Mark: " + s.getMarks() + ", " + "Result: " + s.getResult());
		}
	}

}
