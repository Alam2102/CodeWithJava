package com.test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcateTwoStream {
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        
        Stream<String> conceteStream=Stream.concat
        		(list1.stream(), list2.stream());
        
        conceteStream.forEach(str->System.out.print(str+" "));
	}

}
