 package com.thirdware.comparatorconcepts;


public class OnlineBooking{
	String bus_name,bus_start,bus_reach;
	int bus_id,bus_seats;
	double bus_duration;
   public OnlineBooking(int bus_id, String bus_name, double bus_duration, int  bus_seats, String bus_start,
			String bus_reach) {
		super();
		this.bus_name = bus_name;
		this.bus_start = bus_start;
		this.bus_reach = bus_reach;
		this.bus_id = bus_id;
		this.bus_seats = bus_seats;
		this.bus_duration = bus_duration;
	}
	public OnlineBooking() {
	// TODO Auto-generated constructor stub
}
	@Override
	public String toString() {
		return "OnlineBooking [bus_name=" + bus_name + ", bus_start=" + bus_start + ", bus_reach=" + bus_reach
				+ ", bus_id=" + bus_id + ", seats=" + bus_seats + ", bus_duration=" + bus_duration + "]";
	}
	
	
}
