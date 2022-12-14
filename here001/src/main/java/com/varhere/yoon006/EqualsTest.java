package com.varhere.yoon006;

/**
 * 
 * 이 회사의 사원은 이름과 생일이 같다면 같은 사원으로 인식되도록
 * equals()메소드를 재정의하세요.
 * 
 * @author here
 *
 */

public class EqualsTest{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("유비");
		e.setSalary(1000.0);
		e.setBirthDate(new MyDate(10,4,2000));
		
		Employee e2 = new Employee();
		e.setName("유비");
		e.setSalary(1000.0);
		e.setBirthDate(new MyDate(10,4,2000));
		
		System.out.println(e==e2);
		System.out.println(e.equals(e2));
	}
}
