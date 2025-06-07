package problems.arrays;

//Find Max min and 2ndMax values

public class MaxMin {

	public static void main(String[] args) {

		int arr[] = { 9, 3, 4, 7, 5 };
		int max = Integer.MIN_VALUE;// assume the lowest value for max
		int min = Integer.MAX_VALUE; // assume the higet value for min
		int Max2nd = max;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > max) {
				Max2nd = max;
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > Max2nd && arr[i] < max) {
				Max2nd = arr[i];
			}

		}

		System.out.println(max + " " + Max2nd + " " + min);

	}

}
