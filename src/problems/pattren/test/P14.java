package problems.pattren.test;

import java.util.Arrays;

public class P14 {

	public static void rotate(int arr[], int k) {
		for (int i = 0; i < 3; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j >= 1; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		
		rotate(arr, k);
		//
	}

}
