package com.sunbeam;

import java.util.Scanner;

public class RankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter a no. to find its rank");
		int no = sc.nextInt();
		
		Rank rank = new Rank();
		
		int count = rank.findrank(arr, no);
		System.out.println("Rank of " + no + " is : " + count);
		
		sc.close();
	}

}
