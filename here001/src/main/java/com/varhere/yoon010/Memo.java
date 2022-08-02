//package com.varhere.yoon010;
//
//public class Memo {
//
//}
/**
 * Collection(배열처럼 담아낸다) 추상클래스 존제  -> add(object)가 필요하다  
 * 1.set -> 원소와 원소구성은 다 같지만  순서는 다른 케이스 중복x, 순서x
 * 2.list -> 중복o, 순서o
 * 3.map -> (key-value)쌍으로 이루어져있다. key값이 중복되면 override된다. 
 * 
 * 
 * 
 * set -> HashSet
 * List -> AwayList
 * Map -> HashMap
 * 
 * List<String> list = ~
 *for( String s : list;) {
 *	s.o.p(s);
 *}
 *
 *
 *for(int i = 0; i < list.size(); i++) {
 *	Object o = list.get(1);
 *}
 *
 *
 *public void deleteAll (Collection<NameList> c) {
 *for ( NameList nl : c ) {
 *nl.deleteItem();
 *}
 *}
 *
 *
 *Customer (고객)
 *이름(name)
 *주민번호(ssn)
 *연락처(phone)
 *고객id(customerId)
 *비밀번호(passWd)
 *보유계좌 (List<Account> or Collection<Account>
 *
 *CustomerSerVice : Coustomer에 대한 서비스를 처리하는 클래스 
 *1. 주요 메소드
 *addCoustoner() : 신규 고객추가 
 *getCustomerBySsn() : 주민번호로 고객 조회 
 *getAllCustomers() : 전체 고객 목록 
 *getNumOFCustomers() : 
 */



