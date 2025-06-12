package problems.important;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequecy_Of_Character_in_String{

	//O(n) time complexity
	private static  void count(String str) {
		
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			
			hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
			
		}
		for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			
			System.out.println( entry.getKey() + " : " + entry.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		
		String str = "darshan";
		
		count(str);

	}

}
