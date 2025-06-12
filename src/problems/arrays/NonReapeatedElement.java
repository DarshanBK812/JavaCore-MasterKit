package problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class NonReapeatedElement {

	// Using HashMap TC O(n) SC O(n)

	private static void find2(int arr[]) {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i : arr) {
			hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
		}

		for (int i : arr) {
			if (hashMap.get(i) == 1) {
				System.out.println(i);
			}
		}

	}

	// One way finding but time complexity takes O(n^2)
	public static void find(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 2, 4, 5 };
		find3(arr);
	}

	public static void find3(int arr[]) {
		Arrays.sort(arr);
//		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

}
