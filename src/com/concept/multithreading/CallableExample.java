package com.concept.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Callab  implements Callable<Integer> {

	public Callab() {
		
	}
	
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
			
		}
		
		
		return sum;
	}
	
	
	
}



public class CallableExample {
	
	
	public static void main(String args[]) throws InterruptedException, ExecutionException
	{
		ExecutorService s=Executors.newFixedThreadPool(5);
		Future<Integer> f=s.submit(new Callab());
		System.out.println(f.get());
		
		

	}

}
