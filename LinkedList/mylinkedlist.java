import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class mylinkedlist {
	Node head;
	
	//add of a node at the end
	
	public void add(int data)
	{
		Node temp=head;
		Node addData= new Node(data);
		
		if(head==null)
		{
			head=addData;
			return;
		}
		
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=addData;
		}
	}
	
	//to display the Nodes
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp=temp.next;
		}
	}
	
	// to remove an element from any index
	
	public void remove(int index)
	{
		
		Node temp=head;
		 int counter=0;
		 if(head==null)
			{
				System.out.println("No data");
				return;
			}
		 
		if(index==0)
		{
			head=temp.next;
			return;
		}
		
		
		while(temp.next!=null)
		{
			   
				if(counter==index-1)
				{
					temp.next=temp.next.next;
					return;
				}
				temp=temp.next;
				counter++;
			
		}
		
	}
	
	public int size()
	{
		int counter=0;
		Node temp=head;
		while(temp!=null)
		{
		  temp=temp.next;
		  counter++;
		}
		
		return counter;
		
	}
	
	
	public void set(int index,int x)
	{
		int counter=0;
		Node temp=head;
		while(temp.next!=null)
		{
			if(counter==index)
			{
				temp.data=x;
			}
			temp=temp.next;
			counter++;
		}
	}
	
	public void removehead()
	{
		Node temp=head;
		head=temp.next;
	}
	
	public void clear()
	{
		while(size()!=0)
		{
		removehead();
		}
	}
	
	
	
	
	
	//Implementation of Node 
	static class Node
	{
		private int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}

}



public class linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mylinkedlist li=  new mylinkedlist();
		li.add(16);
		li.add(18);
		li.add(19);
		li.add(15);
                li.add(32);
                li.add(21);
                System.out.println("The Data List: ");
		li.display();
		System.out.println("\nThe size of the List:  "+li.size());
		li.set(2, 17);
		System.out.println("\nThe Data List after Set:");
		li.display();
		li.remove(4);
		System.out.println("\nThe Data List after remove: ");
		li.display();
		System.out.println("\nThe size of the List:  "+li.size());
		
		
		
	
		

	}

}

