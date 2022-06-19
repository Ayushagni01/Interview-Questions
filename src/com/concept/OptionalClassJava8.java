package com.concept;

import java.util.Optional;

public class OptionalClassJava8 {

	
	//example of java optional by using an link and url -https://www.javatpoint.com/java-8-optional

	public static void main(String args[])
	{
	String str[]=new String[10];
	// str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  

	
	//return the empty optional instance
	Optional<Integer> aa=Optional.empty();
//	System.out.println(aa);
	
	//Optional<String> value = Optional.of(str[5]);  //it will return the optional with the specified null value 
	
	//optional.ofNullable  -- it will retyurn the optional with the spec
	Optional<String> value=Optional.ofNullable(str[5]);   //if the field is null it will return the 
	
	
	//filter method in optional
	
	//System.out.println(value.filter(s->s.equals("ABC")));  //if value is present and match the predicate then retuurn the optional otherwise return the empty optional
	//System.out.println(value.filter(s->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
	
	//it will give the output if value present other wise give the some optional result 
	//System.out.println(value.orElse("ayush agnihotri"));
	
	//if present it give the values otherwise generate the value based on the supplier 
	System.out.println(value.orElseGet(()->"Abc"));
	
	

	}
	
	
	
	
}

