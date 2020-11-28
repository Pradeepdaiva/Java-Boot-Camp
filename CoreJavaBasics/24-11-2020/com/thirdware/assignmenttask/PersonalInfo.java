package com.thirdware.assignmenttask;

public class PersonalInfo {

	public int id;
	public char gender;
	public String address;
	public String phone;

	public PersonalInfo(int id, char gender, String address, String phone) {
		this.id = id;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "PersonalInfo [id=" + id + ", phone=" + phone + ", address=" + address + ", gender=" + gender + "]";
	}

}
