package com.sunbeam;

public class NonRepeatingElement {

	public int firstNonRepeatingElement(int[] arr) {
		boolean flag = false;
		for(int i = 0; i < arr.length-1; i++)
		{
			flag = false;
			for(int j = i+1; j<arr.length-1; j++)
			{
				if(arr[i] == arr[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				return arr[i];
			}
		}
		
		return -1;
	}

}
