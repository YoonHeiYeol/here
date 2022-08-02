package com.varhere.yoon006;

public class Employee {
	protected String name;
	protected double salary;
	public MyDate birthDate;
	
	public String getDetails() {
		return "Name: " + name + "\nSalary: " + salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public MyDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public boolean equals (Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			if(e.getName().equals(name) 
					&& e.getBirthDate().equals(birthDate)) {
				return true;
			}
		}
		return false;
	}
	
//	public static void main(String[] args) {
//		MyDate d1 = new MyDate(1, 1, 2000);
//		MyDate d2 = new MyDate(1, 1, 2000);
//		
//		boolean flag = d1.equals(d2);
//		System.out.println(flag);
//	}
}
