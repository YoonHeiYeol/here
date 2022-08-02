package com.varhere.yoon000;

public class TEST002 {
	public static void main(String[] arge) {
		int elements[] = { 1, 2, 3, 4, 5, 6 };
		int hold[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.arraycopy(elements, 0, hold, 0, elements.length);
		System.out.println(elements);
		System.out.println(hold);
	}
}
