package com.test;


import java.util.function.Function;

public class ConvertIntegerToBinary {
	public static void main(String[] args) {
		int n = 333;
		System.out.println("number=" + n);
		Function<Integer,String> convert = num -> Integer.toBinaryString(num);
		String binaryOperation = convert.apply(n);
		System.out.println(binaryOperation);
	}

}
