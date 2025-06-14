package problems.important;

public class Subarray_with_Given_Sum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 7, 5 };
		int sum = 12;
		int val = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			val = val + arr[i];
			if (sum == val) {
				System.out.println(i);
				return;
			}

			while (val > sum) {
				val = val - arr[j];
				j++;
			}
			if (sum == val) {
				for (int i1 = j; i1 <= i - 1; i1++) {
					System.out.println(i1 + " = " + arr[i1] );
				}
				return;
			}
		}

	}

}
