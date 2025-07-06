package problems.important;

import java.util.Arrays;

public class MissingNumber {
	
	public static void find(int arr []) {
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] - arr[i-1] != 1) {
				System.out.println((arr[i] + arr[i-1])/2);
			}
		}
	}

	public static void main(String[] args) {
		
		//Array should be in the natural order
		int arr[] = { 1, 2, 4, 5 };
		find(arr);
		// find the max number 1st
		int max = 0;

		for (int i : arr) {

			max = max < i ? i : max;

		}

		int expSum = (max * (max + 1)) / 2; // fromula to find missing number

		int sum = 0;

		for (int i : arr) {
			// Calculate sum of the element in the array
			sum += i;

		}
		// Then subtract the sum wiht exp sum then we get missing number
		System.out.println(expSum - sum);

	}

}
