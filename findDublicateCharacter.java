package com.test2;

import java.util.Map;
import java.util.stream.Collectors;

public class findDublicateCharacter {
	public static void main(String[] args) {
		String word="abcdefghiabcdei";
		 Map<Character,Long> result=word.chars().mapToObj(i->(char)i)
		                            .collect(Collectors.groupingBy(c->c,Collectors.counting()));
		 
		 result.forEach((k,v)->{
			 if(v>1) {
				 System.out.println(k+":"+v);
			 }
		 });
		 
	}

}
