package Assign2;
import java.util.*;

class Stack1
{
	private int SIZE;
	private int arr[];
	private int top;
	
	public Stack1(int size)
	{
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int value)
	{	
		top++;
		arr[top] = value;
	}

	public int pop()
	{	
		return arr[top--];
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == SIZE -1;
	}
	
}	

public class Question6Assign2{

	
	public static void main(String[] args){							
		int choice;					
		Scanner sc = new Scanner(System.in);
		
		Stack1 s1 = new Stack1(4);
		
		do
		{
			
			System.out.println("1.push "+"2.pop "+ "3.peek "+ "4. Search for Maximum");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1: 
				 if(s1.isFull())
				 System.out.println("Stack1 is Full");
				 
				 else 
				 {
					System.out.println("Enter data to be inserted.......");
					int value = sc.nextInt();
					s1.push(value);
				 }
				break;
			
			
			 case 2:		
					if(s1.isEmpty())
					System.out.println("Stack1 is Empty");
					
					else
					{
					System.out.println("Popped value = " + s1.pop());
					}
					break;
			
				
			 case 3:	
					if(s1.isEmpty())
						System.out.println("Stack1 is Empty");
					
					else
					{
						 System.out.println("peeked data = " + s1.peek());
					}
					 break;
			
			 case 4: 
				  int max=0;
				   while(!s1.isEmpty())
				   {
					   if(max < s1.peek())
					   {
						   max = s1.peek();
					   }
					   s1.pop();					   
				   }
				   System.out.println("The maximum element in stack is " + max);				 	
			}
			
		}while(choice != 0);
		
	}
}
