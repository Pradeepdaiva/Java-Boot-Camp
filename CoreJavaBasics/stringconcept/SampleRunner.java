package com.thirdware.stringconcept;

public class SampleRunner {

	public static void main(String[] args) {
		String s="Welcome";
		String s1="welcome";
		System.out.println(s.charAt(3));
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println((s.equals(s1)?"Strings are Equals":"Strings are not Equal"));
		System.out.println((s.equalsIgnoreCase(s1)?"Strings are Equals":"Strings are not Equal"));
		System.out.println(s.concat(s1));
		System.out.println(s.isEmpty());
		System.out.println(s.indexOf('c'));
		System.out.println(s.replaceAll(s,"Hello"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		

	}

}
