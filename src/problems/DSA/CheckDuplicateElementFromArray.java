package problems.DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//✅ 9. Check for Duplicate Elements

//
//> Return true if any element appears more than once.
//📥 Input: [1, 2, 3, 1] → 📤 Output: true

public class CheckDuplicateElementFromArray {

	public static boolean check(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
				if (count > 1)
					return true;
			}
		}
		return false;
	}

	public static boolean check2(int arr[]) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i : arr) {
			if (!hashSet.add(i)) {
				return true;
			}
		}
		return false;
	}

	public static void removeDuplicates(int arr[]) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i : arr) {
			hashSet.add(i);
		}
		int unique[] = new int[hashSet.size()];

		int index = 0;

		for (int i : hashSet) {
			unique[index++] = i;
		}
		System.out.println(Arrays.toString(unique));
	}

	public static void printDuplicate(int arr[]) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i : arr) {
			hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() != 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1 };

		System.out.println(check2(arr));

		removeDuplicates(arr);
		
		printDuplicate(arr);
	}

}
