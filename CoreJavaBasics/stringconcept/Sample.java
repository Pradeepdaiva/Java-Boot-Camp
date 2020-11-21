package com.thirdware.stringconcept;

public class Sample {
	String str,str1;
	public Sample(String s,String s1) {
		this.str=s;
		this.str1=s1;
	}
	public void charArray() {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
	}
	public void charAt(int i) {
		System.out.println("CharAt method: "+str.charAt(i));		
	}
	public void equalsMethod() {
		System.out.println((str.equals(str1)?"Strings are Equals":"Strings are not Equal"));
		
	}
	public void equalsCaseMethod() {
		System.out.println((str.equalsIgnoreCase(str1)?"Strings are Equals":"Strings are not Equal"));
	}
	public void concatMethod() {
		System.out.println(str.concat(str1));
		}
	public void demo() {
		System.out.println(str.isEmpty());
		System.out.println(str.indexOf('c'));
		System.out.println(str.replaceAll(str,"Hello"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
	}
	
	
}
