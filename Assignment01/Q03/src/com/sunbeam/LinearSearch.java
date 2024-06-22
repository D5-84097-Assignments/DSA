package com.sunbeam;

public class LinearSearch {
	
	int linearsearch(int arr[], int key)
	{
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			count++;
			if(key == arr[i])
				return count;
		}
		
		return count;
	}

}
