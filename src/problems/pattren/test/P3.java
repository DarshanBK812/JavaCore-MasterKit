package problems.pattren.test;

public class P3 {
	public static void main(String[] args) {
		int arr [] = {2 , 3 ,5 , 8 , 7 , 6 ,1};
		int max = arr[0];
		int max2 = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max2 = max;
				max = arr[i];
			}
			else if(arr[i] > max2 && arr[i] < max ) {
				max2 = arr[i];
			}
		}
		System.out.println(max + " " + max2);
	}

}
