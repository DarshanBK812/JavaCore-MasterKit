package problems.arrays;

import java.util.Arrays;

public class SwapHalfOfTheArray2 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int left = 0, half = (arr.length - 1) / 2;
		while (left < half) {
			int temp = arr[left];
			arr[left] = arr[half];
			arr[half] = temp;
			left++;
			half--;
		}

		System.out.println(Arrays.toString(arr));

	}

}
