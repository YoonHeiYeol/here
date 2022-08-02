package com.varhere.yoon004;

import java.util.Date;

public class Employee {
	public String name;
	public double salary;
	public Date birthDate; //Date
	
	public String getDetails() {
		return "Name: " + name + "\nSalary: " + salary;
	}
}
