package com.AA.AllQuestion.MultiThreading;

import java.util.*;
import java.util.stream.Collectors;
public class HashMaps {

	public static void main(String[] args) {
		
		Map<Integer,Integer> amap=new HashMap<>();
		amap.put(5, 10);
		amap.put(2, 1);
		
		List<Map.Entry<Integer,Integer>> aa=new ArrayList<Map.Entry<Integer,Integer>>(amap.entrySet());
		System.out.println(aa);
		
		
	}

	public static void sortHashMapUsingJava8(Map<Integer, Integer> amap) {
		HashMap<Integer, Integer> temp=
		amap.entrySet().stream().sorted((i,j)->i.getValue()-j.getValue()).collect(
				Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
				(x,y)->x,HashMap::new));

		System.out.println(temp);
	}

}
