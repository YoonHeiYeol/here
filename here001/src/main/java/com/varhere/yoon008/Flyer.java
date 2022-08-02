package com.varhere.yoon008;

/**
 * -. abstract매소드의 집합, 상수(public)
 * -. 인스턴스 생성 불가 
 * -. 다중 상속을 지원한다 
 * @author here
 *
 */

public interface Flyer {
	public void fly(); // public,abstract을 생략한다 default가 아니고 생략이다 
	public void takeOff();
	public void land();
}
