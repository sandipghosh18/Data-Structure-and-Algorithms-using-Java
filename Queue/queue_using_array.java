import java.util.Scanner;

class myqueue{
	private int size;
	private int arr[];
	int rear=0;
	int front=0;
	myqueue(int size)
	{
		this.size=size;
		this.arr= new int[size];
	}
	public void enqueue(int data)
	{
		if(rear==size)
		{
			System.out.println("queue is full");
			return;
		}
		else
		{
			arr[rear]=data;
			rear++;
		}
	}
	public void dequeue()
	{
		if(rear==0)
		{
			System.out.println("Queue is empty");
			return;
		}
		else
		{
			for(int i=0;i<rear;i++)
			{
				arr[i]=arr[i+1];
			}
			rear--;
			return;
		}
	}
	public void display()
	{
		for(int i=0;i<rear;i++)
		{
			System.out.print(arr[i]+"<--");
		}
	}
}
public class queue {
    public static void service()
    {
       myqueue mq= new myqueue(5);
    	while(true)
    	{
    		System.out.println("\nEnter your choice\n1: enqueue\n2:dequeue\n3:Display");
    	    int choice;
    	    Scanner sc = new Scanner(System.in);
    	    choice=sc.nextInt();
    	    
    	    switch(choice){
    	    case 1:
    	    	mq.enqueue(12);
    	    	break;
    	    case 2:
    	    	mq.dequeue();
    	    	break;
    	    case 3:
    	    	mq.display();
    	    	break;
    	    	default:
    	    		System.out.println("wrong input");
    	    		break;
    	    	
    	    }
    	    
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        service();
	}

}
