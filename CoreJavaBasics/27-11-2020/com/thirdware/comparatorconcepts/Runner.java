package com.thirdware.comparatorconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<OnlineBooking> list=new ArrayList<>();
		list.add(new OnlineBooking(1,"GARUDA", 6, 20, "6am", "10am"));
		list.add(new OnlineBooking(2,"ORANGE", 8, 30, "10am", "2pm"));
		list.add(new OnlineBooking(3,"BMW", 3, 15, "3am", "5am"));
		list.add(new OnlineBooking(4,"BMW", 8, 25, "6am", "10am"));
		Collections.sort(list,new BusName().thenComparing(new AvailableSeats()));
		for(OnlineBooking s: list)
			System.out.println(s);
	}

}
