package com.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		String str = "my name is navin";
		String a[] = str.split("");
		for (int i = 0; i < a.length; i++) {
			//System.out.print(a[i] + "");
		}
		//System.out.println("");
		for (int j = a.length - 1; j >= 0; j--) {
			//System.out.print(a[j] + "");
		}
		
		
		System.out.println(reverse("MD NOOR ALAM"));

	}
	//reverse String with lambda expression 
   public static String reverse(String str) {
	   return Stream.of(str).map(word->new StringBuffer(word).reverse())
			   .collect(Collectors.joining(" "));
   }
}