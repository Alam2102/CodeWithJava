package com.test;


import java.util.stream.Collectors;

public class RemoveDublicateCharacter {
	public static void main(String[] args) {
		String myString = "aaabbbccccddeeeefffggghhh";
		myString.chars().mapToObj(ch->(char)ch).collect(Collectors.toSet())
		.forEach(System.out::print);
	}

}
