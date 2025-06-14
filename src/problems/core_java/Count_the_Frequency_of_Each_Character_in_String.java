package problems.core_java;

import java.util.HashMap;
import java.util.Map;

public class Count_the_Frequency_of_Each_Character_in_String {

	public static void main(String[] args) {
		String str = "hello";
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
		}
		
		for(Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
