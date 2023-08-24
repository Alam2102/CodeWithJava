package com.test;

import java.util.Scanner;

public class PrimeNumberBetweenTwoNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower bound");
		int lowerbound=sc.nextInt();
		System.out.println("Enter upper bound");
		int upperbound=sc.nextInt();
		
		System.out.println("lowerBound is="+lowerbound+" & upperBound is="+upperbound);
		
		for(int i=lowerbound;i<=upperbound;i++) {
			boolean isPrime=true;
			if(i==0) {
				isPrime=false;
			}
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}

}
