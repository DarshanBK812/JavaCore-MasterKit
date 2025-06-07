package problems.arrays;

import java.util.Arrays;

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

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 0, 4, 5 };
		move(arr);

	}

}
