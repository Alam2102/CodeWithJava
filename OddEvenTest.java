package com.test;

public class OddEvenTest {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println("Odd Number");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i]+",");
			}
		}
		System.out.println();
		System.out.println("Even Number");
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 == 0) {
				System.out.print(a[j]+",");
			}
		}

	}

}
