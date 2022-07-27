package com.YoutubeQuestion;

class Node{
	
	int data;
	Node next;
	
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}

public class ReverseTheLinkedlist {
	Node head=null;
	
	public void insertNode(int data) {
		Node n=new Node(data);
		
		if(head!=null)
		{
			
		}
	}
	
	public void print() {
		
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
		
		
	}
	
	public static void main(String args[])
	{
		ReverseTheLinkedlist a=new ReverseTheLinkedlist();
		a.insertNode(5);
		a.insertNode(6);
		a.insertNode(7);
	
		a.print();
		
		
	}
	
}
