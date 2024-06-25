package Assign2;

import java.util.Scanner;

class CircularQue
{
	private int rear;
	private int front;
	private final int SIZE;
	private int arr[];
	private int counter;
	public CircularQue(int size)
	{
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		counter =0;
	}
	
	public void push(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else
			counter++;
			rear = (rear+1)%SIZE;
			arr[rear] = value;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
		 System.out.println("Queue is Empty");
		 return -1;
		}
		else {
			counter--;
			int value =	arr[(front+1)% SIZE];
			front = (front +1)% SIZE;
			if(front == rear)
				front = rear = -1;
			return value;
		}
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			 System.out.println("Queue is Empty");
			 return -1;
		}
		return arr[(front+1)% SIZE];
	}
	
	public boolean isEmpty()
	{
		return (counter == 0);
	}

	public boolean isFull()
	{
		return (counter == SIZE);
	}
}

public class Ques8Assign2 {

	public static void main(String[] args) {
		
		int choice;		
		Scanner sc = new Scanner(System.in);
		
		CircularQue c1 = new CircularQue(5);
		
		do {
			System.out.println("1.push "+"2.pop "+ "3.peek ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter value to be inserted : ");
						int value = sc.nextInt();
						c1.push(value);
					break;
			
				
				case 2:
					System.out.println("Poped data : " + c1.pop());   
					
						break;
					
				case 3:
					 System.out.println("Peeked data : " + c1.pop());
					   break;
			}
		}while(choice !=0);
		
		sc.close();
	}

}
