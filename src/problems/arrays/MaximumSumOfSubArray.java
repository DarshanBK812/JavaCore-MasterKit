package problems.arrays;

import java.util.Iterator;

public class MaximumSumOfSubArray {

	public static void main(String[] args) {

		int arr[] = { 9, 2, 6, -1, 3, 5, 2 };

		int k = 2;

		int max = arr[0];

		for (int i = 0; i < arr.length - k; i++) {

			int sum = 0;

			for (int j = i; j < i + k; j++) {// j < i+k bcz each i'th iteration k will constant k =2 itself it has to
												// point next two elements in array in order to do that add with i.
				
				sum += arr[j];//  i'th value it remains same for each k'th iteration so take j value
				if(sum < 0) sum = 0;
			}

			max = Math.max(max, sum);
		}

		System.out.println(max);
	}

}
