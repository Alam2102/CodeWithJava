package com.example.demo;

import java.util.Scanner;

public class NumberSwapScanner {
	public static void main(String[] args) {
		int x,y,temp;
		//to print dynamic number in the console
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your swap number");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swap");
		System.out.println(x);
		System.out.println(y);
		
		//now the logic
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swap");
		System.out.println(x);
		System.out.println(y);
		
	}

}
