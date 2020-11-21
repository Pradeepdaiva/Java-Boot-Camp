package com.thirdware.task3;

class Distance {
	int inch, feet;

	Distance(int inch, int feet) {
		this.inch = inch;
		this.feet = feet;
	}

	public Distance() {
		// TODO Auto-generated constructor stub
	}

	public void details(Distance dis1, Distance dis2) {
		System.out.println("Given First Distance Inch and Feet:" + dis1.inch + " " + dis1.feet);
		System.out.println("Given Second Distance Inch and Feet:" + dis2.inch + " " + dis2.feet);
	}

	public void addDistance(Distance dis1, Distance dis2) {
		this.inch = dis1.inch + dis2.inch;
		this.feet = dis1.feet + dis2.feet;
		System.out.println("Add Inch Distance: " + this.inch);
		System.out.println("Add Feet Distance: " + this.feet);
	}

}

public class AddDistance {

	public static void main(String[] args) {
		Distance dis = new Distance();
		Distance dis1 = new Distance(10, 20);
		Distance dis2 = new Distance(20, 10);
		dis.details(dis1, dis2);
		dis.addDistance(dis1, dis2);

	}

}
