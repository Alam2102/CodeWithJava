package com.test;

import java.util.Scanner;

public class SwapWithScanner2 {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("x= " + x);
		System.out.println("y= " + y);

		// swapping logic
		x=x+y;
		y=x-y;
		x=x-y;

		System.out.println("x= " + x);
		System.out.println("y= " + y);

	}

}
