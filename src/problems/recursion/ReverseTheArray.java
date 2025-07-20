package problems.recursion;

import java.util.Arrays;

public class ReverseTheArray {

	public static void rever(int arr[], int left, int right) {
		if (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			rever(arr, left + 1, right - 1);
		} else
			return;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(arr));

		reverse(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	
	//Reduced code
	public static void reverse(int arr[], int left, int right) {
		if (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			rever(arr, left+1, right-1);
		}
	}

}
