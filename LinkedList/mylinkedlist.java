
package LinkedList;

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
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	// to remove an element from any index
	
	public void remove(int index)
	{
		
		Node temp=head;
		 int counter=0;
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
