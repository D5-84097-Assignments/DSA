package com.sunbeam;

public class BinarySearch {
	
	int binarysearch(int arr[], int key)
	{
		int count = 0;
		int left = 0, right = arr.length-1;
		while(left <= right)
		{
			count++;
			int mid = (left + right) / 2;
			if(key == arr[mid])
			{
				return count;
			}
			else if(key < arr[mid])
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		
		
		return count;
	}

}
