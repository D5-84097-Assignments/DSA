package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {

	public int sortarr(int[] arr) {
		int comparison = 0;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				comparison++;
				if(arr[i] > arr[j])
				{
					int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
				}
			}
		}
		System.out.println("Sorted array is : " + Arrays.toString((arr)));
		return comparison;
	}

}
