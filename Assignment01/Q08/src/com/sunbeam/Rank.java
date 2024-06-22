package com.sunbeam;

public class Rank {

	public int findrank(int[] arr, int no) {
		int count = 0;
		for(int i = 0; i < arr.length-1; i++)
		{
			if(arr[i] <= no)
			{
				count++;
			}
		}
		return count+1;
	}

}
