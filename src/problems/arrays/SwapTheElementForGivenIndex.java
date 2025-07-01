package problems.arrays;

import java.util.Arrays;

public class SwapTheElementForGivenIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int i = 2;
		int j = 5;
		int temp = arr[2];
		arr[2] = arr[5];
		arr[5] = temp;
		System.out.println(Arrays.toString(arr));

	}

}
