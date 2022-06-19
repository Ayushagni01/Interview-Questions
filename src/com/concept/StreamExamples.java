package com.concept;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.*;

class Product{
	
	public int id;
	public String name;
	public float price;
	
	//constructor
	
	public Product(int id, String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	
	
}

//https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html

public class StreamExamples {

	public static void main(String[] args) {

		System.out.println("********************Stream Concept Started Here**********************");
		
		 List<Product> pl = new ArrayList<Product>();  
	         
	        pl.add(new Product(1,"HP Laptop",25000f));  
	        pl.add(new Product(2,"Dell Laptop",30000f));  
	        pl.add(new Product(3,"Lenevo Laptop",28000f));  
	        pl.add(new Product(4,"Sony Laptop",38000f));  
	        pl.add(new Product(5,"Apple Laptop",90000f)); 
		
		//use of filter map and collect method in one go
	   List<Float>ol= pl.stream().filter(e->e.price>30000f).map(e->e.price).collect(Collectors.toList());   
	   System.out.println(ol); 
	   
	   //find all the even number exists in the list or not
       List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	   System.out.println(myList.stream().filter(x->x%2==0).collect(Collectors.toList()));
	   
	   
	   //.forEach Method in the stream is 
	   myList.stream().filter(x->x%2==0).forEach(System.out::println);
	   
	   //find out the number starting with 1 in the given string
	   myList.stream().filter(x->(String.valueOf(x)).startsWith("1")).forEach(System.out::println);
	   //solve this question using map
	   myList.stream().map(x->x+"")//convert int into string
	   .filter(x->x.startsWith("1")).forEach(System.out::println);
	   
	   //how to find out the duplicate element in the given string 
	   Set<Integer> a=new HashSet<>();
	   myList.stream().filter(x->!a.add(x)).forEach(System.out::print);
	   //here we are printing the set for out references
	   
	   
	   //Given the list of integers, find the first element of the list using Stream functions?
	   myList.stream().findFirst().ifPresent(System.out::println);
	   
	   //find the total element in the list 
	   long count=myList.stream().count();
	   System.out.println("the count of eleement is ="+count);
	   
	   //Given a list of integers, find the maximum value element present in it using Stream functions?
	   int x=myList.stream().max(Integer::compare).get();
	   System.out.println("The Maximum element is "+x);
       
	   
	   // Given a String, find the first non-repeated character in it using Stream functions?
	   String input = "Java Hungry Blog Alive is Awesome";
	   
	   
	   
	   
	   
		
		System.out.println("********************Stream Concept Ended Here**********************");

	}

}
