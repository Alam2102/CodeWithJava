 package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibnociTest {
	public static void main(String[] args) {
		int a1 = 0, a2 = 1, a3, count = 10;
		//System.out.print(a1 + " " + a2);
		for (int i = 2; i < count; i++) {
			a3 = a1 + a2;
			//System.out.print(" " + a3);
			a1 = a2;
			a2 = a3;
		}
		System.out.print(generateSeries(10));
	}

	
	//using lambda expression
	public static List<?> generateSeries(int series) {
		return Stream.iterate(new int[] { 0, 1 }, 
				s -> new int[] { s[1], s[0] + s[1] })
				.limit(series).map(n -> n[0])
				.collect(Collectors.toList());
	}

}
