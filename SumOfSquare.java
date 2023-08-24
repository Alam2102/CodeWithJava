package com.test;


import java.util.Arrays;
import java.util.List;

public class SumOfSquare {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3);
		int sum_square = nums.stream().mapToInt(n -> n * n).sum();
		System.out.println(sum_square);
	}     

}
     