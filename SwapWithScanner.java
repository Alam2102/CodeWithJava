package com.test;

import java.util.Scanner;

public class SwapWithScanner {
	public static void main(String[] args) {
		int x, y, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("x= " + x);
		System.out.println("y= " + y);

		// swapping logic
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping");
		System.out.println("x= " + x);
		System.out.println("y= " + y);

	}
}
