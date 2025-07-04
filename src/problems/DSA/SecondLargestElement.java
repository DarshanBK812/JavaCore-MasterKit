package problems.DSA;

//7. Find the Second Largest Element

//
//> Return the second largest number in the array.
//📥 Input: [10, 5, 20, 8] → 📤 Output: 10

public class SecondLargestElement {

	public static void find(int arr[]) {
		int max = arr[0];
		int max2 = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max2 = max;
				max = arr[i];
			} else if (arr[i] > max2 && arr[i] < max) {
				max2 = arr[i];
			}
		}
		System.out.println("Max :" + max + " Max2 : " + max2);

	}

	public static void main(String[] args) {
		int arr[] = { 10, 5, 20, 8 };
		find(arr);
	}

}
