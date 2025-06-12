package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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

	// Without using another for loop
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

	// Best way
	public static void move3(int arr[]) {
		int left = 0, mid = 0, right = arr.length - 1;
		while (mid <= right) {
			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[right];
				arr[right] = temp;
				right--;
			} else if (arr[mid] != 0) {
				int temp = arr[mid];
				arr[mid] = arr[left];
				arr[left] = temp;
				left++;
				mid++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	// Sort the element
	public static void move4(int arr []) {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i : arr) {
			list.add(i);
		}
		System.out.println(list);
//		ListIterator<Integer> iterator = list.listIterator();
//		Arrays.sort(list);
		Collections.sort(list);
		int index = 0;
		for (int i : list) {
			if(i != 0) {
				arr[index++] = i;
			}
		}
		for (int i : list) {
			if(i == 0) {
				arr[index++] = i;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 0, 4, 0 };
		move4(arr);

	}

}
