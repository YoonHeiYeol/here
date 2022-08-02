package com.varhere.yoon005;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addProduct(new NoteBook("thinkPad"));
		cart.addProduct(new SmartPhone("Samsung Galuxy"));
		cart.addProduct(new SmartPhone("Apple iphone"));
		
		System.out.println(cart.getDetails());
	}
}
