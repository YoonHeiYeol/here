package com.varhere.yoon004;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "뚱바";
		e.salary = 1000;
		e.birthDate = new Date();
		String detail = e.getDetails();
		System.out.println(detail);
		System.out.println(e.birthDate);
		
		Manager m = new Manager();
//		m.department = "영업부";
		m.name = "춘식";
		m.salary = 2000.0;
		System.out.println(m.getDetails());
	}
}
