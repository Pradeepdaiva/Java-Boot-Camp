package com.thirdware.mapconcepts;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.thirdware.setconcepts.Sets;

public class MapsConcept {

	public static void main(String[] args) {
		Map<Integer,Sets> m=new TreeMap<>();
		m.put(4,(new Sets(1,300000,"Honda-civ","Honda")));
		m.put(3,(new Sets(2,300000,"Honda-civ","Honda")));
		m.put(2,(new Sets(3,300000,"Honda-civ","Honda")));
		m.put(1,(new Sets(4,30000099,"Honda-civ","Honda")));
		for(int i=1;i<=m.size();i++)
		System.out.println(m);
		System.out.println(m.containsValue(m.get(7)));
		System.out.println(m.keySet());
		System.out.println(m.values());
	}

}
