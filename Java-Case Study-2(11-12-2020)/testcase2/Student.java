package com.thirdware.testcase2;

public class Student {

	private int studentId;
	private String studentName;
	private int marks;
	private String result;
	private Courses course;

	public Student(int studentId, String studentName, int marks, Courses course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.course = course;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", result="
				+ result + course + "]";
	}

}
