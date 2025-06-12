package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheSumOfTwoNumber {

	public static int[] check(int arr[], int key) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int partner = key - arr[i];
			if (list.contains(partner)) {
				return new int[] { arr[i], partner };
			}

			list.add(arr[i]);
		}
		return null;
	}
	
	

	public static void main(String[] args) {
		int arr[] = { 3, 7, 4, 6, 9 };

		int key = 10;
		System.out.println(Arrays.toString(check(arr, key)));

	}

}
