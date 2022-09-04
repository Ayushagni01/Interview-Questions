package com.concept.collection;

import java.util.*;

public class ListExample
{
	
	
	public static void main(String[] args) {
	
		LinkedList<String> aa=new LinkedList<>();
		
		
		
		
		
		//addFirsst(E e);
		//add();
		//contains
		//get
		//getLast
		//peeks
		//pollFist
		//polllast
		//pop
		//push
		//remove
		//removeLast
		//removefisrst
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//arrayListmethod(); 
   
		
		
		
		
	
		
	}

	private static void arrayListmethod() {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);

		
		//index Of method   --indexOf
		
  //  System.out.println(al.indexOf(30));

		 
  //how to update a value at particluar index in arrayList -set a element in the arrayList   set
   
		//al.set(2, 50);
		//   System.out.println(al);
		
		//how to remove element on the index in arrayList --remove method   remove 
  //  al.remove(2);
   // System.out.println(al);
		
		//remove the object  --remove the object from the arrayList   remove object 
		
  //  al.remove(new Integer(30));
 //   System.out.println(al);
		
		//contains method
		
		 al.subList(1, al.size()).forEach(System.out::print);
	}
	
	

}
