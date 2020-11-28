package com.thirdware.collectionconcepts;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("Hello");
		list.add('C');
		list.add(25.00);
		list.add(true);
		System.out.println("ArrayList: "+list);
		list.remove(2);
		System.out.println("After removed: "+list);
		list.add(2,'Z');
		System.out.println("After Add with index: "+list);
		list.remove(list.indexOf(10));
		System.out.println("After remove particular value: "+list);
	}

}
