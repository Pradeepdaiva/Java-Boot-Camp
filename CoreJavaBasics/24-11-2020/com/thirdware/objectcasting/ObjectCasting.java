package com.thirdware.objectcasting;

class Vehicle{
	public void brand() {
		System.out.println("Honda");
	}
}
class Car extends Vehicle{
	public void brand() {
		System.out.println("Honda City");
	}
}
public class ObjectCasting {
	
	public static void main(String[] args) {
		Vehicle v=new Car();
		Vehicle vr=new Vehicle();
		vr.brand();
		v.brand();
		}

}
