package problems.arrays;

// 1 ,2 , 3, _ , 5 find the missing number here 
//Calculate the sum of numbers from 1 to N using the formula: N * (N + 1) / 2. 

//find N which is the largest natural number and after tha find expNumber using formula
// expnum = (n*(n+1))/2 and calculate all the sum of all the arrays element and 
// subtract with exp number 

public class FindTheMissingNumber {

	static int find(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5 };
		int sum = 0;
		int lastNaturalNumber = find(arr);
//		System.out.println(lastNaturalNumber);
		int expSum = (lastNaturalNumber * (lastNaturalNumber + 1)) / 2;

		for (int i : arr) {
			sum += i;
		}

		System.out.println(expSum - sum);
	}

}
