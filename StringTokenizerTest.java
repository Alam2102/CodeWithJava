package com.test;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "Hello World";
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		// reverse of String
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		//System.out.println("Reverse of String=" + sb);

	}

}
