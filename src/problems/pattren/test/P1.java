package problems.pattren.test;

import java.util.LinkedHashSet;

public class P1 {
	
	private static void remove(int arr []) {
		
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		for(int i : arr) {
			linkedHashSet.add(i);
		}
		System.out.println(linkedHashSet);
	}
	
	private void remove2(int arr []) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(arr[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		int [] num = {1,2,2,3,4,4};
		remove(num);
	}

}
