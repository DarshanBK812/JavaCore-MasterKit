package problems.arrays;

import java.util.HashMap;

public class FrequencyOfArrayElements {

	public static void main(String[] args) {
		
		int[] arr = { 2, 3, 5, 2, 3, 3, 7, 5, 2 };
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (int num : map.keySet()) {
			System.out.println(num + " = " + map.get(num));
		}
		System.out.println();

	}

}
