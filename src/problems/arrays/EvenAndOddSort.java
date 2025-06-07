package problems.arrays;

import java.util.Arrays;

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
				earr[l++] = arr[k++];
			else
				oarr[r++] = arr[k++];
		}
		
		k = 0;
		while(k< arr.length) {
			
			for(int i : earr) {
				arr[k++] = i;
			}
			for(int i : oarr) {
				arr[k++] = i;
			}
			
		}
		System.out.println(Arrays.toString(arr));


	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		sort(arr);
	}

}
