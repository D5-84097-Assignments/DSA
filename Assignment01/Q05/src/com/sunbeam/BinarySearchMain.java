package com.sunbeam;

import java.util.Scanner;

public class BinarySearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {90,80,70,60,50,40,30,20,10};
		System.out.println("Enter key to be searched");
		int key = sc.nextInt();
		
		BinarySearch bs = new BinarySearch();
		
		int index = bs.search(arr,key);
		if(index != -1)
		{
			System.out.println("Key found at index : " + index);
		}
		else
		{
			System.out.println("Key not found");
			
		}
		sc.close();
	}

}
