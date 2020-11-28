package com.thirdware.setconcepts;

import java.util.Comparator;

public class Sets implements Comparator<Sets> {

	int i, price;
	String companyName, modelName;

	public Sets(int i, int price, String companyName, String modelName) {
		super();
		this.i = i;
		this.price = price;
		this.companyName = companyName;
		this.modelName = modelName;
	}

	public Sets() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LinkedSet [i=" + i + ", price=" + price + ", companyName=" + companyName + ", modelName=" + modelName
				+ "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + i;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Sets other = (Sets) obj;
//		if (i != other.i)
//			return false;
//		return true;
//	}

	@Override
	public int compare(Sets s1, Sets s2) {
		
		return s1.companyName.compareTo(s2.companyName);
	}

	
}
