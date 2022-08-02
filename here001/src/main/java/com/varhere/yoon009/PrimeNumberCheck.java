package com.varhere.yoon009;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	public static void main(String[] args) {
		int count = 0;
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		for(int i = number; i < 1000; i++) {
			for(int j = 2; j <= i; j++) {
				if( i % j == 0) {
					count++;
				}
			}
			if(count==1 && i==number) {
				System.out.println(number + "은 소수입니다.");
			}else if(count!=1 && i!=number){
				System.out.println(number + "은 소수가 아닙니다.");
			}
			count = 0;
		}
	}
//	public static void main1(String[] args) {
//		try {
//			
//		}catch {
//			
//		}
//	}
}