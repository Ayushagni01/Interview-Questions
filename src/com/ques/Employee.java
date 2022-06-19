package com.ques;

public class Employee implements Comparable<Employee> {
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	private  String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		if(o.getId()>this.id)
		{
			return -1;
		}
		else if(o.getId()<this.id)
		{
			
			return 1;
		}
		return 0;
	}
	
	
	
	
	

}
