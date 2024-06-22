package com.sunbeam;

public class LinearSearch {

	public int search(int[] arr, int key, int occ) {
		int count = 0;
		for(int i=0; i < arr.length-1; i++)
		{
			if(arr[i] == key)
			{
				count++;
				if(count == occ)
				{
					return i;
				}
			}
		}
		return -1;
	}

}
