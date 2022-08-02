package com.varhere.yoon004;

public class Manager extends Employee {
	private String department;
	
	public String getDetails() {
		return super.getDetails() + "\nDepartment: " + department;
	}
}
