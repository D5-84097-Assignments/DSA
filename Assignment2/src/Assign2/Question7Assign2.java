package Assign2;

class Stack2
{
	private int SIZE;
	private int arr[];
	private int top;
	
	public Stack2(int size)
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


public class Question7Assign2 {

	public static void main(String[] args) {
		
		
		int[] arr = {10, 20, 30, 40, 50};
		Stack2 st2 = new Stack2(arr.length);
		
		System.out.println("Before Reversing");
		for(int i=0; i<arr.length; i++)
		{
		  st2.push(arr[i]);
		  System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{	
			arr[i] = st2.peek();
			st2.pop();
		}
		
		System.out.println("After Reversing");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print( arr[i]+ " ");
		}
		
	}

}
