package com.YoutubeQuestion;
import java.util.*;

	/*
	 * Question on find the destination and departure
	 * Date -23-05-2022 TIme 10:18
	 * Taken help from geeks for geeks 
	 */

public class DepartmentDepartureQuestion {
	
	
	
	
	public static void main(String[] args) {
		
		 Map<String, String> dataSet = new HashMap<String, String>();
	        dataSet.put("Chennai", "Banglore");
	        dataSet.put("Bombay", "Delhi");
	        dataSet.put("Goa", "Chennai");
	        dataSet.put("Delhi", "Goa");
		
	        
	        findTheDepartureAndDepartmentDate(dataSet);
		
		
	}

	private static void findTheDepartureAndDepartmentDate(Map<String, String> dataSet) {
		
		//a.find the starting point here
		
		
		//Make a reverse hashMap and make key as value and value as key
		Map<String,String> reverseMap=new HashMap<>();
		
		for(Map.Entry<String, String> amap:dataSet.entrySet())
		{
			reverseMap.put(amap.getValue(), amap.getKey());
		}
		
		String startingPoint=null;
		//Now traverse the dataset and check if key is exists in the reverseMap
		for(Map.Entry<String, String> amap:dataSet.entrySet())
		{
		
			if(!reverseMap.containsKey(amap.getKey()))
			{
				startingPoint=amap.getKey();
				break;
				
			}
			
			
		}
		
		//till then we got out starting point 
		//now we need to print out the whole point to print out the whole path
		
		String to =dataSet.get(startingPoint);
		while(to!=null)
		{
			System.out.print(startingPoint+"->"+to+", ");
			startingPoint=to;
			to=dataSet.get(to);
			
			
		}
		
		
		//Time 
		
	}

}
