package problems.important;

import java.util.Arrays;

public class Searching {

	private void linearSerach(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("found");
				return;
			}
		}
	}

	private boolean binarySearch(int arr[], int key) {
		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;

		while (left <= right) {
			int mid = (right + left) / 2;

			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] > key) {
				right = mid - 1;
			} else if (arr[mid] < key) {
				left = mid + 1;
			}

		}
		return false;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 8, 4, 7, 3 };
		Searching searching = new Searching();
		int key = 3;
		searching.linearSerach(arr, key);
		System.out.println(searching.binarySearch(arr, key));
	}

}
