package problems.core_java;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 9, 1, 6 };
		int l1 = arr[0];
		int l2 = arr[0];
		for(int i : arr) {
			if(i > l1 && i < l2) {
				l2 = l1;
				l1 = i;
			} else  {
				l2 = i;
			}
		}
		
		System.out.println(l2);
	}

}
