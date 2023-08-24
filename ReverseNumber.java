package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseNumber {

	public static void main(String[] args) {

		int n;
		int reverse = 0;
		System.out.println("enter an integer to reverse");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse Number=" + reverse);

      //=====================================================================

		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		Stream<Integer> stream = Stream.of(5, 7, 2, 5, 6);
		List<Integer> list1 = stream.collect(Collectors.toList());
		Collections.reverse(list1);
		System.out.println(list1);

	}

}
