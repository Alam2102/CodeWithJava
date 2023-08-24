package com.demo;

public class findPositionFromArray {
	public static void main(String[] args) {
		// find the position of 15
		int a[] = { 10, 9, 7, 3, 1, 15, 19 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 15) {
				System.out.println("position of the "+a[i]+ " element is="+i);
				break;
			}
		}
	}

}
