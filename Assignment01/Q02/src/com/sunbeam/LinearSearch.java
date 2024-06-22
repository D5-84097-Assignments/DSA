package com.sunbeam;

public class LinearSearch {

	int search(int arr[], int key)
	{
		for(int i=arr.length-1; i>=0; i--)
		{
			if(key == arr[i])
				return i;
		}
		
		return -1;		
	}
}
