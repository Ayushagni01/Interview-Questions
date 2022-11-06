package com.ques;

 class Parent {

public void run()
{
    walk();
    System.out.println("Parent run");
}

public void walk()
{
    System.out.println("Parent walk");
}
}

 class ParentChildQuestions extends Parent {
	 
	 public void run()
	 {
	     super.run();
	     System.out.println("child run");
	 }

	 public void walk()
	 {
	     super.walk();
	     System.out.println("child walk");
	 }


	
}


public class ParentChildQuestion{
	
	public static void main(String[] args) {
		Parent p=new  ParentChildQuestions();
		p.run();
	}
	
}