package Linkedlist;


 class MyLinkedList {
	
	Node head;
	
	
	public void add(int data)
	{
		Node temp=head;
		
		Node adddata= new Node(data);
		if(head==null)
		{
			head=adddata;
			return;
		}
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=adddata;
	}
	
	public void print()
	{
		System.out.print("LinkedList: ");
		Node temp=head;
		if(head==null)
		{
			System.out.print("No data");
		}
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	public void removelast()
	{
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
	}
	
	public void removefirst()
	{
		Node temp=head;
		head=temp.next;
		
	}
	
	public Node getlast()
	{
		Node temp=head;
		
		return temp;
		
	}
	
	public void merge(Node a)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=a;
	}
	
	public int returnTop()
	{
		Node temp=head;
		return head.data;
	}
	
	public int get(int index)
	{
		
		Node cc=head;
		int counter=0;
		while(cc.next!=null)
		{
			cc=cc.next;
			counter++;
		}
		
		if(index>counter)
		{
			System.out.print("No index");
			return 0;
		}
		
		
		int data=0;
		Node temp=head;
		int i=0;
		
		while( i!=index)
		{
			temp=temp.next;
			i++;
		}
		data=temp.data;
		
		return data;
	}
	
	
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}

}
 class myqueue {
	
	MyLinkedList ml= new MyLinkedList();
	
	

	public void insertion(int data)
	{
		ml.add(data);
	}
	
	public void deletion()
	{
		ml.removefirst();
	}
	
	public int getpeak()
	{
		int top=ml.returnTop();
		
		return top;
	
	}
	
	public void display()
	{
		ml.print();
	}
	

	}


public class queuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   myqueue qe = new myqueue();
	   
	   
	   
	   qe.insertion(12);
	   qe.insertion(14);
	   qe.insertion(17);
	   qe.insertion(15);
	   qe.display();
	   qe.deletion();
	   qe.display();
	   

	   
	
	   
       
	 
	}

}
