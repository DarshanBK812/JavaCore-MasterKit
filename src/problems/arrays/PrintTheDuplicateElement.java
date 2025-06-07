package problems.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class PrintTheDuplicateElement {

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int se = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > se) {
				arr[j + 1] = arr[j];
				j--;
			}
			j++;
			arr[j] = se;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	static void remove(int arr[]) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : arr) {
			if (set.contains(i)) {
				System.out.println(i);
			}
			set.add(i);
		}
	}

	public static void remove2(int arr[]) {
		insertionSort(arr);
//		System.out.println(Arrays.toString(arr));

//		Arrays.sort(arr);
		
		for(int i = 1 ; i< arr.length ; i++) {
			int j = i-1;
			int count = 0;
			if(arr[j] == arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 1, 2, 3, 3 , 4 };
		remove2(arr);
		

	}

}
