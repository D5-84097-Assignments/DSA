package Assign2;

import java.util.*;

class LinearQueue
{   
	 private int arr[];
	 private int front,rear;
	 private final int SIZE;
	
	public LinearQueue(int SIZE)
	{
		this.SIZE = SIZE;
		arr = new int[SIZE];
		front = rear = 0;
   	}
	 
	public void push(int value)
	{	
		arr[rear] = value;
		rear++;
	}
	
	public int pop()
	{	
		int value = arr[front];
		front++;
		return value;
	}
	
	public int peek()
	{
		return arr[front];
		
	}
	
	public boolean isEmpty()
	{
		return rear==front;
	}
	
	public boolean isFull()
	{
		return rear == SIZE;
	}
	
}


public class Question4Assign2 {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		LinearQueue q = new LinearQueue(4);		
		int choice;
		
		do
		{
			System.out.println("1.push "+"2.pop "+ "3.peek ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				
			case 1:
				if(q.isFull())
					System.out.println("Queue is Full");
				
				else
					System.out.println("Enter value to be inserted.......");
					int value = sc.nextInt();
					q.push(value);
					break;
			
			case 2:
					if(q.isEmpty())
						System.out.println("Queue is Empty");
				
					else
					    System.out.println( "poped Data = " + q.pop());
				break;
			
				
			case 3:	
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				
				else
					 System.out.println("peeked data = " + q.peek());
					break;
				
			}
			
		}while(choice !=0);
		
		sc.close();		
	}
	

}
