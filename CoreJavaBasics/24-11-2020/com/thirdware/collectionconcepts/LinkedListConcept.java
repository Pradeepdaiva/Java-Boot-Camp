package com.thirdware.collectionconcepts;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("LinkedList: "+list);
		list.remove(2);
		System.out.println("After removed: "+list);
		list.add(2,'Z');
		System.out.println("After Add with index: "+list);
		list.remove(list.indexOf(5));
		System.out.println("After remove particular value: "+list);
		

	}

}
