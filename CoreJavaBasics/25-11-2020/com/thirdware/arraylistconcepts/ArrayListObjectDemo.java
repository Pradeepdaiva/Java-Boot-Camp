package com.thirdware.arraylistconcepts;

import java.util.ArrayList;

public class ArrayListObjectDemo {

	public static void main(String[] args) {
		ArrayListObject arr1=new ArrayListObject(1,"Honda","Honda-city",300000);
		ArrayListObject arr2 = new ArrayListObject(2,"Nissan","Nissan GT-R",1200000);
          ArrayList<ArrayListObject> list=new ArrayList<>();
          list.add(arr1);
          list.add(arr2);
          list.add(new ArrayListObject(3,"Yamaha","R15",200000));
          list.add(new ArrayListObject(4,"Bike"));
          list.remove(arr2);
          for(ArrayListObject arr:list)   //enhanced lopp
        	  System.out.println(arr);
          for(int i=0;i<list.size();i++) //normal loop
          System.out.println(list);
          
	}

}
