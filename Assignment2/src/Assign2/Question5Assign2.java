package Assign2;

import java.util.Scanner;

class Stack
{
	public int[]stack;
	private final int SIZE;
	private int top; 
	
	public Stack(int size)
	{	
		SIZE = size;
		stack = new int[SIZE];
		top = SIZE;
	}
	
	public void push(int i)
	{	
		top--;
		stack[top] = i;
	}
	
	public int pop()
	{
		return stack[top++];
	}
	
	public int peek()
	{
		return stack[top];
	}
	
	public boolean isEmpty()
	{
		return top == SIZE;
	}
	
	public boolean isFull()
	{
		return top == 0; 
	}
	
}


public class Question5Assign2 {
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(4);
	   int choice;
	   

		do
		{
			System.out.println("1.push "+"2.pop "+ "3.peek ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				
			case 1:
				if(s.isFull())
					System.out.println("Stack is Full");
				
				else
					System.out.println("Enter value to be inserted.......");
					int value = sc.nextInt();
					s.push(value);
					break;
			
			case 2:
					if(s.isEmpty())
						System.out.println("Stack is Empty");
				
					else
					    System.out.println( "poped Data = " + s.pop());
				break;
			
				
			case 3:	
				if(s.isEmpty())
					System.out.println("Stack is Empty");
				
				else
					 System.out.println("peeked data = " + s.peek());
					break;
				
			}
			
		}while(choice !=0);
		
		sc.close();		
	}
		
	}


