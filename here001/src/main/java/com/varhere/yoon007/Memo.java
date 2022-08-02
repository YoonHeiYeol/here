//package com.varhere.yoon007;
//
//public class Memo {
//	public static void main(String[] args) {
//		System.out.println("name");
//	}
//}
//
//public static void doSomething();
//public void doSomething();
//
//
//ParseInt
//integer.parseInt(String);
//
//if
//public thread (Runnable r);

//private final static -> 할수있는 최고의 보안? 


//import
//
//public static int count
//
//count를 다른곳에서 쓰고싶을때 s.o.p(counter.count); 라고 써야하는데 갯수가 많으면 다 써야하니까 
//import static @@@.counter; 라고 쓴다.

//추상클래스
//객체를 못만듬.
//클래스안에 추상클래스가 존재하면 그 클래스는 반듯이 추상클래스여야한다.
//부모가 추상일때 자식도 보통 추상인데 자식이 추상이 싫으면 오버라이딩해야한다.



//은행계좌정보는 크게savingaccount와 checkingaccount로 분류되며 세부 공통 정보로서는 계좌번호  잔액이 있으면 각각 이자율과 마이너스 대출 한도액을 가진다
//각 계좌는 초기입금액이 공통으로 필요하며 세이빙어카운트는 이자율을 체킹어카운트는 대출 한도액이 필요하다
//각 계좌는 초기 입금액을 토대로 출금이 가능하며 출금시 자신의 잔액보다 클 경우 예외를 발생시키도록 구성한다
//출금 로직 구현시 제약사항을 반드시 두 계좌가 동일 메소드로 정의돌 수 있도록 보장되어야 한다
//계좌번호는 문자열이며 모든 금액 정보는 실수형으로 정의한다
//
//네이밍 관례에 따른 클래스 변수 생정사 메소드를 지정할 수 있다
//요구사항에 따른 데이터 타임을 선언할 수 있다
//각 클래스를 요구사항에 따라 정의하고 상속관게를 구성할 수 있다
//객체 지향적 구조와 생정자및 메소드 설계를 할 수 있다
//예외처리를 적절하게 설계하고 구현할 수 있다  