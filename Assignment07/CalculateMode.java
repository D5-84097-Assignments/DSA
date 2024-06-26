package com.app;

import java.util.HashMap;
import java.util.Map;

public class CalculateMode {

	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 2, 4, 3, 2, 3, 2, 6, 7, 1, 8, 2, 3, 4, 1, 9};
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int maxKey = 0;
		int maxValue = 0;
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			if(e.getValue() > maxValue) {
				maxKey = e.getKey();
				maxValue = e.getValue();
			}
		}
		System.out.println("Mode of array is: " + maxKey);
	}

}
