package com.ques;
import java.util.*;
 
import java.util.HashSet;
import java.util.Set;
 
class Employees
{
    private String name;
    private int age;
 
    public Employees(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
 
    @Override
    public boolean equals(Object o)
    {
       
        Employees employee = (Employees) o;
 
      
        if (!name.equals(employee.name)) {
            return false;
        }
 
        return true;
    }
 
    @Override
    public int hashCode()
    {
        int result = name.hashCode();
        result = 1 * result + age;
        return result;
    }
 
    @Override
    public String toString()
    {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
 

public class EmployeeHashMap {
	
		public static void main(String[] args)
	    {
	        Employees e1 = new Employees("John", 20);
	        Employees e2 = new Employees("John", 20);
	 
	        
	        Map<Employees,Integer> aa=new HashMap<>();
	        aa.put(e1,1);
	        aa.put(e2, 2);

	    System.out.println(aa);
	
		
	}

}
