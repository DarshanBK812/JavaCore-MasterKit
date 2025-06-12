package problems.important;

import java.util.ArrayList;
import java.util.ListIterator;

public class Sub_Array_With_Given_sum {

	public static boolean chekc(int arr[], int key) {
		int sum = 0;
		int left = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			while (sum > key && left <= i) {

				sum -= arr[left++];
			}

			if (sum == key) {
				while (left <= i) {
					System.out.println(arr[left]);
					left++;

				}
				return true;
			}

		}
		return false;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 20, 3, 10, 5 };
		int key = 33;
		System.out.println(check2(arr, key));
	}
	
	public static boolean check2(int arr [] , int key) {
		int sum = 0;
		int left = 0;
		
		if(sum == key) return true;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			while( left < arr.length && sum  > key) {
				sum = sum - arr[left];
				left++;
				if(sum == key) return true;
			}
			
		}
		return false;
	}

}
