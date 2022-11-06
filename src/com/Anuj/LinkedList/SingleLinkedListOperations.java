package com.Anuj.LinkedList;

class Node{
	
	public int data;
	public  Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}


public class SingleLinkedListOperations {

	//insert the data in the list list and Traverse the data 
	public static void main(String[] args) {
		Node n=new Node(10);
		Node n1=new Node(20);
		Node n2=new Node(30);
		
		Node head=n;
		head.next=n1;
		n1.next=n2;
		n2.next=null;
		
		//print the linkedlist
		//head = printingLinkedList(head);
		
		//insert node at the middle
		//	extracted(head);
		//reverse the linked list here 
		//extracted(head);
		
		//palindrome  a linkedlist here
			//a.middle of the linkedlist here
		Node s=head;
		Node f=head;
		Node middle=findMiddleElement(s, f);
	
		printingLinkedList(middle);
		//Now Reversing the element afte the middle of the node
	
	}


	public static Node findMiddleElement(Node s, Node f) {
		while(f!=null && f.next!=null)
		{
			System.out.println("middle");
			s=s.next;
			f=f.next.next;
		}
		return s;
	}


	public static Node printingLinkedList(Node head) {
		while(head!=null)
		{
		System.out.println("the data is "+head.data);
			head=head.next;
		}
		return head;
	}
	public static void Reversealinkedlist(Node head) {
		Node curr=head;
		Node prevs=null;
		
		
		while(curr!=null)
		{
			Node temp=curr.next;
			curr.next=prevs;
			prevs=curr;
			curr=temp;
			
			
		}
		prevs = printingLinkedList(prevs);
	}
	public static void extracted(Node head) {
		int pos=2;
		Node newNode=new Node(5);
		Node prev = head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.next;
		}
		
//		System.out.println(prev.data);
			newNode.next=prev.next;
			prev.next=newNode;
			head = printingLinkedList(head);
			
	}
	
	
}

