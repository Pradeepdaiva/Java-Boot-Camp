package com.thirdware.arraylistconcepts;

public class ArrayListObject {

	int i;
	int price;
	String companyName, modelName;

	public ArrayListObject(int i, String companyName, String modelName, int price) {
		super();
		this.i = i;
		this.price = price;
		this.companyName = companyName;
		this.modelName = modelName;

	}

	public ArrayListObject(int j, String string) {
		this.i = j;
		this.companyName = string;
	}

	@Override
	public String toString() {
		return "ArrayListObject [i=" + i + ", companyName=" + companyName + ", modelName=" + modelName + ", price="
				+ price + "]";
	}

}
