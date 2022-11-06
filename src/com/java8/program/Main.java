package com.java8.program;

import java.util.Arrays;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		   int[] a={0,1,2,3,4,5,6,7,8,9};
		   List<int[]> aa=new ArrayList<>();

		   int chunk = 3; // chunk size to divide


		   for(int i=0;i<a.length;i+=chunk){

			   aa.add(Arrays.toString(Arrays.copyOfRange(a, i, Math.min(a.length,i+chunk))));
		       System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, Math.min(a.length,i+chunk))));
		   }
		
	}

}
