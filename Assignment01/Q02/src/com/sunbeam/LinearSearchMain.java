package com.sunbeam;

import java.util.Scanner;

public class LinearSearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50,70,60,70,80,90};
		System.out.println("Enter key to be searched");
		int key = sc.nextInt();
		
		
		LinearSearch ls = new LinearSearch();
		int index = ls.search(arr , key);
		if(index != -1)
			System.out.println("Key found at index :" + index);
		else
			System.out.println("Key not found");
		sc.close();
	}

}
