package com.ques;

import java.util.*;
public class ComparableClass {

	public static void main(String[] args) {
	
		
		Employee e=new Employee(2,"ayush");
		Employee e1=new Employee(3,"agnihotri");
		Employee e2=new Employee(1,"shivam");
		
		
		List<Employee> a=new ArrayList<Employee>();
		a.add(e);
		a.add(e1);
		a.add(e2);
		
		
		Collections.sort((List<Employee>) a);
		
		
		for(Employee ee:a)
		{
			System.out.println(ee.getId());
		}
		

	}

	

}
