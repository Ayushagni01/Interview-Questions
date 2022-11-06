package com.AA.AllQuestion.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {
	
public static void main(String[] args) {
		
		Map<Integer,Integer> amap=new HashMap<>();
		amap.put(5, 10);
		amap.put(2, 1);
		
		
		
	}

public static void sortByusingCollectionSort(Map<Integer, Integer> amap) {
	List<Map.Entry<Integer,Integer>> aa=new ArrayList<Map.Entry<Integer,Integer>>(amap.entrySet());
	Collections.sort(aa,new Comparator<Map.Entry<Integer,Integer>>(){
		public int compare(Map.Entry<Integer, Integer> a,Map.Entry<Integer, Integer> b) {
			return a.getKey()-b.getKey();
		}
		
	});
	HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
	for (Map.Entry<Integer, Integer> yy : aa) {
	    temp.put(yy.getKey(), yy.getValue());
	}
	System.out.println(temp);
}

	public static void sortHashMapUsingJava8(Map<Integer, Integer> amap) {
		HashMap<Integer, Integer> temp=
		amap.entrySet().stream().sorted((i,j)->i.getValue()-j.getValue()).collect(
				Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
				(x,y)->x,HashMap::new));

		System.out.println(temp);
	}


}
