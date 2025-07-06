package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveTheDuplicateElements {


	//Using hashMap removed duplicate elements fromm the array
	public static void remove3(int arr []){
		Map<Integer , Integer> map = new HashMap<>();
		for(int i : arr){
			map.put(i , map.getOrDefault(i , 0)+1);
		}
		List<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			if(entry.getValue() == 1){
				list.add(entry.getKey());
			}
		}
		int temp [] = new int[list.size()];
		int index = 0;
		for(int i : list){
			temp[index++] = i;
		}
		System.out.println(Arrays.toString(temp));
	}

	static void remove2(int arr[]) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : arr) {
			set.add(i);
		}
		System.out.println(set);
	}

	// without using hashMap
	static void remove(int arr[]) {
		int unique = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					unique--;
				}
			}
		}
		System.out.println(unique);
		int index = 0;
		int arr2[] = new int[unique];
		for (int i = 0; i < arr.length; i++) {
			boolean b = true;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					b = false;
					break;
				}
			}
			if (b) {
				arr2[index++] = arr[i];

			}
		}

		System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 1, 2, 3, 4 };
		remove(arr);

	}

}
