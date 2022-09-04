package com.java8.program;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Map;
public class ReverseaStringUsingJava8 {
	
	
	public static void main(String args[]) {
		
		
		
		Integer in[]= {1,2,3,4,3,3,5,5,6};
		Stream<Integer> as=Stream.of(in);
		System.out.println(	as.anyMatch(x->x==3));
		
		
		String a="ayush";
		//reversing the string into java8
		String s=Stream.of(a).map(x->new StringBuilder(x).reverse().toString()).collect(Collectors.toList()).get(0);
		//System.out.println(s);
		String s1=Arrays.asList(a).stream().map(x->new StringBuilder(x).reverse().toString()).collect(Collectors.toList()).get(0);
		//System.out.println(s);
		
		
		 String input = "ayussssh";

	Map<Object, Long> aa=Stream.of(input.toLowerCase().split("")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
	aa.entrySet().forEach(x->{
		if(x.getValue()>1)
		{
			//System.out.println(x.getKey()+"  "+x.getValue()); 
		}
	});	 
	
	
	         // convert string into stream
	        Map < Character, Long > result = input
	            .chars().mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

	        result.forEach((k, v) -> {
	            if (v > 1) {
	       //         System.out.println(k + " : " + v);
	            }
	        });
	
	}



}
