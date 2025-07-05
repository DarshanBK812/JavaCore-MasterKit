package problems.important;

import java.util.Arrays;
import java.util.HashMap;

//Subarray with Given Sum :

//Given a 1-based indexing array arr[] of non-negative integers and an integer sum. 
//You mainly need to return the left and right indexes(1-based indexing) of that subarray.
//In case of multiple subarrays, return the subarray indexes which come first on moving from left to right
//If no such subarray exists return an array consisting of element -1.

public class Check_for_Subarray_with_Given_Sum {

	//Using HashMap
	public static int[] find(int arr[], int target) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int pair = targget - arr[i];
			if (hashMap.containsKey(pair)) {
				return new int[] { hashMap.get(pair), i };
			}

			hashMap.put(arr[i], i);
		}
		return new int[] { -1 };
	}

	//Using a Set
	public static int[] find2(int arr[], int target){
	Set<Integer> set = new HashSet<>();
		for(int i = 0; i < arr.length; i++){
			int pair = target - arr[i];
			if(set.contains(pair)){
				return new int[] {pair , arr[i]};
			}
			set.add(arr[i]);
		}
		return new int[] { -1 };
	}
	public static void main(String[] args) {
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int target = 230;
		System.out.println(Arrays.toString(find(arr, target)));
	}

}
