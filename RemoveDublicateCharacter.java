package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDublicateCharacter {
	public static void main(String[] args) {
		String s1 = "aaabbbccccddeeeefffggghhh";
		char ch[] = s1.toCharArray();
		Set<Character> set = new HashSet<>();
		for (char c : ch) {
			set.add(c);
		}
		StringBuffer sb = new StringBuffer();
		for (Character chh : set) {
			sb.append(chh);
		}
		//System.out.println(sb);
		
		//===============================================
		//Using java 8 features:
		
		String originalChar="bcabc";
		originalChar.chars().mapToObj(c->(char)c)
		.collect(Collectors.toSet()).forEach(System.out::print);

	}

}
