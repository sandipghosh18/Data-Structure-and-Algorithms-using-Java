
package LinkedList;

class linkedlist
{
	static Node head;
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
class stack extends linkedlist
{
		
		//implementation of stack properties
		
		public void push(int data)
		{
			Node temp=head;
			Node addNode= new Node(data);
			
				if(head==null)
				{
					head=addNode;
					return;
				}
				
				while(temp.next!=null)
				{
					temp=temp.next;
			    }
				temp.next=addNode;
			
		}
		public void display()
		{
			Node temp=head;
			
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
		public int pop()
		{
			Node temp=head;
			int data=0;
			
			try
			{
			
			if(head.next==null)
			{
				head=null;
				return temp.data;
			}
			
			while(temp.next!=null)
			{
				
				
				
				 if(temp.next.next==null)
				{
					data=temp.next.data;
					temp.next=null;
					return data;
				}
				
			   //data=temp.next.next.data;
				temp=temp.next;
				
			}
			}
			catch (Exception E)
			{
				System.out.println("Stack is empty");
				
			}
			
			
			return data;
			
		}
		
		public int peek()
		{
			Node temp=head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			int data=temp.data;
			return data;
		}
		
		
		
		
	}


public class stackusinglinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack stk= new stack();
		stk.push(13);
		stk.push(17);
		stk.push(18);
		stk.push(28);
		stk.display();
		System.out.println("Stack peek value is= "+stk.peek());
		System.out.println("Stack after popping "+stk.pop());
		stk.display();
		System.out.println("Stack after popping "+stk.pop());
		stk.display();
		System.out.println("Stack after popping "+stk.pop());
		stk.display();
		System.out.println("Stack after popping "+stk.pop());
		stk.display();
		stk.pop();
		stk.display();
		
		
		

	}

}
