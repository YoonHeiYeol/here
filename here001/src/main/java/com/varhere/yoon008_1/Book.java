package com.varhere.yoon008_1;

public class Book extends Libray {
	
	int maxBook = 100;

	@Override
	public void addBook() {
		for(int i = 0; i <= maxBook; i++) {
			if(maxBook<=i) {
				maxBook = maxBook*2;
			}
//			System.out.println(i);
		}
		System.out.println("책정보가 등록되었습니다.");
	}

	@Override
	public void getBook() {
		System.out.println("책이 대출되었습니다.");
	}

}
