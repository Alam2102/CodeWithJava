package com.test;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringWithReadFromUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter word for reverse");
		String str = sc.next();
		String[] str2 = str.split("");
		for (int i = str2.length - 1; i >= 0; i--) {
			System.out.print(str2[i]);
		}

		System.out.println(getReverse("Noor Alam"));
	}

	// or
	public static String getReverse(String str) {
		return Stream.of(str).map(w -> new StringBuffer(w).reverse())
				.collect(Collectors.joining(" "));

	}
}
