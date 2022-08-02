package com.varhere.yoon010;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "nada"); // API 보고 확인해보시오!
		map.put(2, "nadaa"); // 기본형타입 오토박싱이라는 기능이 자동으로 바꾸어줌!
		map.put(new Integer(3), "nadaaa");
		
		System.out.println(map.get(new Integer(1)));
//		System.out.println(map.get(1)); 9.0부터는 이렇게 쓰는게 좋타!
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.println(integer);
			System.out.println("  =  " + map.get(integer));
		}
	}
}
