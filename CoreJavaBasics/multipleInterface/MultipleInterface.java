package com.thirdware.multipleInterface;

interface SampleA{
	public  void bodyA();
}
interface SampleB{
	public void bodyB();
}
 abstract class SampleC implements SampleA,SampleB {

	@Override
	public void bodyB() {
		System.out.println("SampleB is visible");
		
	}

	@Override
	public abstract void bodyA(); 

	

	}
 class SampleD extends SampleC{

	@Override
	public void bodyA() {
		System.out.println("SampleA is visible");
		
	}
	 
	 
 }
 public class MultipleInterface{
	 public static void main(String[] args) {
		SampleD sample = new SampleD();
		sample.bodyA();
		sample.bodyB();
	}
 }

	

