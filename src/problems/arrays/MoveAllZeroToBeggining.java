package problems.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MoveAllZeroToBeggining {

	public static void move(int arr[]) {

		int j = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[j--] = arr[i];
			}
		}
		while (j >= 0) {
			arr[j--] = 0;
		}
		System.out.println(Arrays.toString(arr));

	}

	// Proper way
	public static void move2(int arr[]) {
		int left = 0, middle = 0, right = arr.length - 1;
		while (middle <= right) {
			if (arr[middle] == 0) {
				int temp = arr[middle];
				arr[middle] = arr[left];
				arr[left] = temp;
				left++;
				middle++;
			} else if (arr[middle] != 0) {
				int temp = arr[middle];
				arr[middle] = arr[right];
				arr[right] = temp;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	// Using Collection
	public static void move3(int arr[]) {
		LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {

			hashMap.put(i, arr[i]);

		}
		System.out.println(hashMap);

		int index = 0;

		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == 0) {
				arr[index++] = entry.getValue();
			}
		}

		System.out.println(Arrays.toString(arr));

		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() != 0) {
				arr[index++] = entry.getValue();
			}
		}

		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 0, 4, 5 };
		move3(arr);

	}

}
