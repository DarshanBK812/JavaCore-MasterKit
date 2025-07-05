package problems.important;

import java.util.HashMap;

public class Count_Number_of_Pairs_with_Given_Sum {

	//using a set and time and space complexity O(N)
	public void findPairs(int arr [] , int sum){
		Set<Integer>() set = new HashSet<>();
		for(int i : arr){
			int pair = sum - i;
			if(set.contains(pair)){
				Syste.out.println(i);
			}
			set.add(i);
		}
	}

	//Without using collection time and space complexity O(N^2) 
	 public static void main(String[] args) {
  
		int[] arr = { 1, 5, 7, -1 };
		int sum = 6;
	
		int temp = 0;
		for(int i = 0 ; i<arr.length ; i++){
			 int pair = sum - arr[i];
			  for (int j = 0; j<arr.length  ; j++ ){
				    if(arr[j] == pair){
				      System.out.println(arr[j]);
				    }
			  }	 
		 }
	 }
	
	
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
