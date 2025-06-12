package problems.important;

import java.util.Arrays;

public class Reverse_An_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int left = 0, right = arr.length - 1;

		// Time complexity O(log n)
		while (left < right) {

			int temp = arr[left];

			arr[left] = arr[right];

			arr[right] = temp;

			left++;

			right--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
