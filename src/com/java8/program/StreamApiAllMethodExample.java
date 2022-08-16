package com.java8.program;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiAllMethodExample {

	public static void main(String[] args) {
		
		
		//This is how we can convert the list of integer into stream
		Stream<Integer> s=Stream.of(1,2,34,5,6,7,8);
		s.filter(x->x%2==0).forEach(System.out::print);
		
		//conversion of array into streaM API
		Integer b[]= {1,2,3,4,5,6,7};
		Stream<Integer> s1=Stream.of(b);
		s1.filter(x->x%2==0).forEach(System.out::print);
	
		//conversion of the string into the stream api
		String a="ayush";
		IntStream ss=a.chars();
		ss.forEach(System.out::print);
		
		
		String[] aa
		
	}
	
	
}
