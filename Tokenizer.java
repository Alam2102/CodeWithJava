package com.example.demo;

import java.util.StringTokenizer;

public class Tokenizer {
	public static void main(String[] args) {
		String str="Hello World";
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}

}
