package problems.important;

import java.util.HashMap;

public class Count_Number_of_Pairs_with_Given_Sum {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1 };
		int sum = 6;
		
		int count = 0;
		HashMap<Integer, Integer>  hashMap = new HashMap<Integer, Integer>();
		for(int i : arr) {
			int pair = sum - i;
			if(hashMap.containsKey(pair)) {
				
				System.out.println(pair + "+" + i );
				count++;
			}
			hashMap.put(i, 1);
		}
		
		System.out.println(count);
	}

}
