package problems.arrays;

import java.util.HashMap;

public class FrequencyOfArrayElements {

	public static void find2(int arr[]) {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//		for(int i = 0 ; i<arr.length ; i++) {
//			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) +1)
//			;
//		}

		for (int i : arr) {
			if (hashMap.containsKey(i)) {
				hashMap.put(i, hashMap.get(i) + 1);
			} else {
				hashMap.put(i, 1);
			}
		}

		System.out.println(hashMap);
	}

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
