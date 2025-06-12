package problems.pattren.test;

import java.util.Arrays;
import java.util.HashMap;

public class P6 {
	
	private static int[] find(int arr [] , int target) {
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int pair = target - arr[i];
			if(hashMap.containsKey(pair)) {
				return new int [] { hashMap.get(pair) , i  };
			}
			
			hashMap.put(arr[i], i);
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		int arr [] = {3 , 6 , 2 , 4, 5 , 1};
		int target = 4;
		System.out.println(Arrays.toString(	find(arr , target)));;
	}

}
