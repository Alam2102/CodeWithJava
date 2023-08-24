package com.test;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(getReverseString("Java Developer"));
	}

	public static String getReverseString(String str) {
		return Stream.of(str).map(word -> new StringBuffer(word ).reverse()).
				collect(Collectors.joining(" "));
	}

}
