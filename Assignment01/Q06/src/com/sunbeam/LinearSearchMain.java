package com.sunbeam;

import java.util.Scanner;

public class LinearSearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,10,40,10,20,40,10,10,20,30};
		System.out.println("Enter key to be searched");
		int key = sc.nextInt();
		System.out.println("Enter occurance of that key");
		int occ = sc.nextInt();
		
		LinearSearch ls = new LinearSearch();
		
		int index = ls.search(arr,key,occ);
		if (index != -1)
		{
			System.out.println("Key found at index : " + index);
		}
		else
		{
			System.out.println("Occurance " + occ + "th of given key not found");
		}
		
		sc.close();
		
	}

}
