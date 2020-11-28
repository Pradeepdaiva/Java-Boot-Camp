package com.thirdware.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Kumar", 12, "Nehru street"));
		list.add(new Student(2, "Ravi", 10, "Raja street"));
		list.add(new Student(5, "Ramesh", 10, "Tiruvallur street"));
		list.add(new Student(3, "Suresh", 11, "Ritchie street"));
		list.add(new Student(4, "Naveen", 15, "South usman road"));

		Iterator<Student> iterator = list.iterator();
//		for(Student s:list) {
//			if(s.name.endsWith("esh")) {
//			    list.remove(s);
//			}
//		}
		while (iterator.hasNext()) {
			if (iterator.next().age >= 15) {
				iterator.remove();
			}
		}
		for (Student s : list) {
			System.out.println(s.age);
		}
	}

}
