package problems.arrays;

import java.util.HashMap;

public class Count_The_Pairs_For_Given_Sum {

	static void count(int arr[], int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k)
					count++;
			}
		}
		System.out.println(count);

	}

	static void count2(int arr[], int k) {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int pair = k - arr[i];
			if (hashMap.containsKey(pair)) {
				count++;
			}

			hashMap.put(arr[i], 1);
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, -1, 5 };
		int k = 6;
		count2(arr, k);
	}

}
