package com.sunbeam;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched");
		int key = sc.nextInt();
		int arr[] = {10,20,30,40,50,60,70,80,90};
		
		LinearSearch s1 = new LinearSearch();
		int c1 = s1.linearsearch(arr, key);
		//if(c1 != -1)
			System.out.println("No of comparisons needed = " + c1);
		//else
		//	System.out.println("Key not found in total comparisons =" + (arr.length+1));
		
		
		BinarySearch s2 = new BinarySearch();
		int c2 = s2.binarysearch(arr, key);
		//if(c2 != -1)
			System.out.println("No of comparisons needed = " + c2);
		//else
		//	System.out.println("Key not found in total comparisons =" + c2);
		sc.close();
	}

}

