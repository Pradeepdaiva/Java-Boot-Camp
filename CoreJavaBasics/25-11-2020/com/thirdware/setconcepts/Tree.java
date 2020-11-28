package com.thirdware.setconcepts;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		Set<Sets> set=new TreeSet<>();
		set.add(new Sets(5,300000,"Honda-city","Honda"));
		set.add(new Sets(2,300000,"Honda-Civic","Honda"));
		set.add(new Sets(3,300000,"Honda-Jazz","Honda"));
		set.add(new Sets(1,300000,"Honda-civ","Honda"));
		set.add(new Sets(9,300000,"Honda-civ","Honda"));
//		for(Sets l:set)
//		System.out.println(l.i +" "+l.companyName+" "+l.modelName+" "+l.price);
		System.out.println(set);
	}

}
