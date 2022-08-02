package com.varhere.yoon006;

public class Manager extends Employee {
	private String department;
	
	public String getDetails() {
		return super.getDetails() + "\nDepartment: " + department;
	}
}
