package problems.pattren.basic;

import java.util.Arrays;

public class SumOfNext2Numbers_InArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int n = arr.length;

		int x = 2;
		int temp[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= x; j++) {
//				System.out.println("(i+2)%n " + (i+j)%n);
				int index = (i + j) % n;
				sum = sum + arr[index];
			}
			temp[i] = sum;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));

	}

}
