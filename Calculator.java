package com.test;

interface Addition {

	int add(int a, int b);
}

class Calculator {
	public static void main(String[] args) {
		Addition add = (int a, int b) -> (a + b);
		System.out.println(add.add(20, 30));
	}

}
