package com.java8.concept;
import java.util.*;
import java.util.stream.Collectors;
public class ConvertListToMap {
	
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
	
	
		Map<Integer, List<Product>> collect = productsList.stream().collect(Collectors.groupingBy(Product::getId,Collectors.toList()));
		collect.entrySet().forEach(x->{
		System.out.println(x.getKey()+" "+x.getValue());
		});
		
		
	
	}

}
