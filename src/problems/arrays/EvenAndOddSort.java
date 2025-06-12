package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenAndOddSort {

	static void sort(int arr[]) {
		int even = 0;
		int odd = 0;
		for (int i : arr) {
			if (i % 2 == 0)
				even++;
			else
				odd++;
		}

		int earr[] = new int[even];
		int oarr[] = new int[odd];
		int l = 0;
		int r = 0;
		int k = 0;
		for (int i : arr) {
			if (i % 2 == 0)
				earr[l++] = i;
			else
				oarr[r++] = i;
		}

		k = 0;
		while (k < arr.length) {

			for (int i : earr) {
				arr[k++] = i;
			}
			for (int i : oarr) {
				arr[k++] = i;
			}

		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 1, 9, 3, 4, 5, 6, 7, 8 };
		sort3(arr);
	}

	// Updated Version
	public static void sort2(int arr[]) {
		int left = 0, mid = 0, right = arr.length - 1;
		while (mid <= right) {

			if (arr[mid] % 2 == 0) {
				int temp = arr[mid];
				arr[mid] = arr[left];
				arr[left] = temp;
				mid++;
				left++;
			} else if (arr[mid] % 2 != 0) {
				int temp = arr[mid];
				arr[mid] = arr[right];
				arr[right] = temp;
				right--;

			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void sort3(int arr[]) {

		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		for (int i : arr) {

			if (i % 2 == 0) {

				even.add(i);

			} else {

				odd.add(i);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		int index = 0;

		for (int i : even) {

			arr[index++] = i;
		}
		for (int i : odd) {

			arr[index++] = i;
		}

		System.out.println(Arrays.toString(arr));

	}

}
