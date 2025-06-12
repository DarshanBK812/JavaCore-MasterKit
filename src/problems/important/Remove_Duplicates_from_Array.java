package problems.important;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicates_from_Array {
	
	private static  void remove(int arr []) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int i : arr) {
			hashSet.add(i);
		}
		
		int [] unique = new int[hashSet.size()];
		int j = 0;
		for(int i : hashSet) {
			unique[j++] = i;
		}
		
		System.out.println(Arrays.toString(unique));
		
	}
	
	public static void main(String[] args) {
		int arr [] = {1 ,3 , 2 ,1 , 4 , 1 , 2 , 5};
		remove(arr);
		
	}

}
