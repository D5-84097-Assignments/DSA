package com.sunbeam;

public class NonRepeatingElementMain {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		
		NonRepeatingElement element = new NonRepeatingElement();
		
		int value = element.firstNonRepeatingElement(arr);
		if(value != -1)
		{
			System.out.println("First non repeating element is : " + value);
		}
		else
		{
			System.out.println("Does not found any non repeating element");
		}

	}

}
