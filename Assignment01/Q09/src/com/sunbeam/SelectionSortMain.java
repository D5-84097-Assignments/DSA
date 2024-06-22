package com.sunbeam;

public class SelectionSortMain {

	public static void main(String[] args) {
		int arr[] = {20,40,50,60,80,90,70,30,10};
		
		SelectionSort sort = new SelectionSort();
		
		int comparisons = sort.sortarr(arr);
		System.out.println("No of comparisons : " + comparisons);
	}

}
