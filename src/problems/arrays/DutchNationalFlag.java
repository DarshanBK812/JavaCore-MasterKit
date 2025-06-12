package problems.arrays;

import java.util.Arrays;

//Arrange the array in a  0 , 1 , 2 order

public class DutchNationalFlag {

	public static void main(String[] args) {
		int arr[] = { 2, 0, 2, 1, 1, 0 };

		int start = 0, mid = 0, end = arr.length-1;

		while (mid <= end) {


			if (arr[mid] == 0) {

				int temp = arr[mid];

				arr[mid] = arr[start];

				arr[start] = temp;

				start++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {

				int temp = arr[mid];

				arr[mid] = arr[end];

				arr[end] = temp;

				mid++;

				end--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
