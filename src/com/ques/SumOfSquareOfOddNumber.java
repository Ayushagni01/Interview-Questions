package com.ques;

import java.util.stream.Collectors;
import java.util.*;
public class SumOfSquareOfOddNumber {
	
	
	public static void main(String[] args) {
		
		Integer []a= {3,5,5};
		List<Integer> aa=Arrays.asList(a);
int d=	aa.stream().filter(x->x%2!=0).map(x->x*x).collect(Collectors.summingInt(Integer::intValue));
	System.out.println(d);
	}

}
