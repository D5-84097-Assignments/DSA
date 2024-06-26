package com.app;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			System.out.println(System.getProperty("user.dir"));
			File file = new File("./file1.txt");
			Scanner fs = new Scanner(file);
			Map<String, Integer> map = new HashMap<>();
			while(fs.hasNext()) {
				String word = fs.next();
				map.put(word, map.getOrDefault(word, 0)+1);
			}
			for(Map.Entry<String, Integer> e : map.entrySet()) {
				System.out.println(e.getKey() + " " + e.getValue());
			}
			fs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
