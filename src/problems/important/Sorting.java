package problems.important;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {

	private void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int small = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[small]) {
					small = j;
				}
			}
			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean b = false;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					b = true;
				}
			}
			if (!b)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}

	private void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int small = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > small) {
				arr[j + 1] = arr[j];
				j--;
			}
			j++;
			arr[j] = small;

		}

		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 8, 3 };
		Sorting sorting = new Sorting();
		sorting.selectionSort(arr);

		sorting.bubbleSort(arr);
		sorting.insertionSort(arr);

	}

}
