package problems.arrays;

import java.util.Arrays;

public class MoveAllZeroToEnd {

	public static void move(int arr[]) {
		int arr2[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {

				arr2[j++] = arr[i];
			}
		}

		while (j < arr2.length) {
			arr2[j++] = 0;
		}
		System.out.println(Arrays.toString(arr2));
	}

	
	//Without using another  for loop
	public static void move2(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j++] = arr[i];
			}
		}
		while (j < arr.length) {
			arr[j++] = 0;
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 0, 4, 5 };
		move2(arr);

	}

}
