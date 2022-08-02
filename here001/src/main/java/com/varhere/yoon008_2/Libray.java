package com.varhere.yoon008_2;

public class Libray {
	private Book[] books = new Book[100];
//	private Libray();
	private static Libray libray = new Libray();
	
	public static Libray getLibray() {
		return libray;
	}
	
	public void addBook(Book b) {
		for(int i = 0; i < books.length; i++) {
			if(books[i] == null) {
				books[i] = b;
				break;
			}
		}
	}
	
	public Book[] getBooks() {
		return books;
	}

}
