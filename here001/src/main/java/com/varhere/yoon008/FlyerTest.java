package com.varhere.yoon008;

public class FlyerTest {
	
	public static void main(String[] args) {
//		Flyer a = new getFlyer();
		Flyer f = new Airplane();
		f.takeOff();
		Flyer b = new Bird();
		b.takeOff();
	}
}
