package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) { 
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(2);
		list.add(20);
		list.add(15);
		System.out.println("first statement:"+list);
		
		//Comparator<Integer> c=(i1<i2)?-1:(i1>i2)?1:0;
		Collections.sort(list,(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0);
		list.stream().forEach(System.out::println);
		//to find even number
		List<Integer> ls=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> ls1=list.stream().filter(i->i%2!=0).collect(Collectors.toList());

		System.out.println("second statement:"+ls);
		System.out.println("second==== statement:"+ls1);

		
		Collections.sort(ls,(i1,i2)->(i1>i2)?1:(i1<i2)?-1:0);
		list.stream().forEach(System.out::println);
		
	}

}
