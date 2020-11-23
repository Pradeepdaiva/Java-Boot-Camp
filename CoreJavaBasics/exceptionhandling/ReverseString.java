package com.thirdware.exceptionhandling;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   try {
//		   StringBuffer sb=new StringBuffer("Hello");
//		   sb.reverse();
//		   System.out.println(sb);
		   String str=sc.next();
		   String s="";
		   char ch[]=str.toCharArray();
		   for(int i=str.length()-1;i>=0;i--) {
			   if(ch[i]>='0'&& ch[i]<='9') {
				   throw new Check("Given value is not string:");
			   }
		   }
		   for(int i=str.length()-1;i>=0;i--) {
			   s+=ch[i];
		   }
		   System.out.println("Reverse String value: "+s);
		   
	   }catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	   finally{
		   sc.close();
	   }

	}

}
