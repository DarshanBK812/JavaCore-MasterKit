package problems.arrays;

import java.util.Arrays;

public class RightRotateArray {

	static void rotate(int arr[], int rotate) {
		for (int i = 0; i < rotate; i++) {
			int temp = arr[arr.length-1];
			for (int j = arr.length - 1; j >= 1; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int times = 2;
		rotate(arr, times);
	}

}
