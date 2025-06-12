package problems.pattren.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P8 {
	
	private static void doIt(int arr []) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i  : arr){
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		System.out.println(map);
		for(Map.Entry<Integer , Integer> i : map.entrySet()) {
			if(i.getValue() >1) {
				System.out.println(i.getKey());
			}
		}
	}
	public static void remove(int arr []) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
				if(count >1) System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr [] = {1 , 2 , 3 , 4 , 3 , 6 , 9 , 6 };
		remove(arr);
	}

}
