package com.thirdware.testcase2;

public class Courses {

	private int courseId;
	private String courseName;
	public int targetScore;

	public Courses() {
		super();
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getTargetScore() {
		return targetScore;
	}

	public void setTargetScore(int targetScore) {
		this.targetScore = targetScore;
	}

	@Override
	public String toString() {
		return  "courseName: " + courseName ;
	}
	
	

}
