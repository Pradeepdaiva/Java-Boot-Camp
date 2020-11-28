package com.thirdware.comparatorconcepts;

import java.util.Comparator;


public class BusName implements Comparator<OnlineBooking>{

	@Override
	public int compare(OnlineBooking o1, OnlineBooking o2) {
		
		return o1.bus_name.compareTo(o2.bus_name);
	}
	
}
 class AvailableSeats implements Comparator<OnlineBooking>{

	@Override
	public int compare(OnlineBooking o1, OnlineBooking o2) {
		
		return o1.bus_seats-o2.bus_seats;
	}
	 
 }
