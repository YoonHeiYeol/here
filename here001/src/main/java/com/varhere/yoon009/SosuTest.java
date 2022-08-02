package com.varhere.yoon009;

import java.util.Scanner;

public class SosuTest {
	public static int Sosu() throws SosuException {
		int count = 0;
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		for(int i = number; i <= 1000; i++) {
			for(int j = 2; j <= i; j++) {
				if( i % j == 0 ) {
					count++;
				}
			}
			if(count==1) {
				throw new SosuException(number + "은(는) 소수입니다.");
			}else {
				throw new SosuException(number + "은(는) 소수가 아닙니다.");
			}
//			count = 0;
		}
		return number;
	}
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		try {
			System.out.println(Sosu());
		} catch (SosuException e) {
			System.err.println(e.getMessage());
		}
	}
}
