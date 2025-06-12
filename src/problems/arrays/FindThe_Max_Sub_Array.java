package problems.arrays;

public class FindThe_Max_Sub_Array {

	void find(int arr [] , int k ) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < k+i; j++) {
				sum += arr[j];
				if(sum <= 0) sum = 0;
			}
			max = max < sum ? sum : max;
		}
		System.out.println(max);
	}
	
	

	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// assume max
		int max = -2;
		// assume
		int sum = 0;
		// iterate till array
		for (int i = 0; i < arr.length; i++) {
			// calculate sum
			sum += arr[i];
			// if sum <= 0 make sum = 0 ;
			if (sum <= 0)
				sum = 0;
			// compare a sum with a max if sum is greater than max make sum as max
			max = max < sum ? sum : max;
		}
		System.out.println(max);
	}

}
