package com.varhere.yoon008_3;

public class Book {
	private int serial;
	private String title; 
	public static int bookNum = 1;
	
	public Book(String title) {
		this.serial = bookNum;
		bookNum++;
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getSerial() {
		return this.serial;
	}
}
