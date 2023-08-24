package com.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Map<Test, String> map = new HashMap<>();
		map.put(t1, "t1");
		map.put(t2, "t2");
		System.out.println(map.size());
		System.out.println(map.get(t1));
		System.out.println(map.get(t2));

	}

}
