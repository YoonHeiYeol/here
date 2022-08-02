package com.varhere.yoon003;

public class Array002 {
	public static void main(String[] args) {
		int list1 [] = new int [10];
		int list2 [] = new int [6];
		for(int i = 0; i < list1.length; i++) {
			for(int j = 0; j < list2.length; j++) {
				if(i == j) {
					System.out.println(i + " ");
				}
			}
		}
	}
}
