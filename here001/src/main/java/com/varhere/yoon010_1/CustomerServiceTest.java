package com.varhere.yoon010_1;

import java.util.*;

public class CustomerServiceTest {
	public static void main(String[] args) {
		Customer ct = new Customer();
		ct.setName("YoonHeeYeol");
		ct.setSsn("960226");
		ct.setPhone("010-5235-3457");
		ct.setCustomerId("tgb0000");
		ct.setPassWd("qlalfqjsgh12");
		System.out.println(ct.getName());
		System.out.println(ct.getSsn());
		System.out.println(ct.getPhone());
		System.out.println(ct.getCustomerId());
		System.out.println(ct.getPassWd());
	}
}
