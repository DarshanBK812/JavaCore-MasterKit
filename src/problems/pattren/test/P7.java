package problems.pattren.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class P7 {
	
	private static  void find(String str) {
		
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		for(char ch : str.toCharArray()) {
			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch : str.toCharArray()) {
			if(hashMap.get(ch) == 1) {
				System.out.println(ch);
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		String str = "bhabhavn";
		find(str);
	}

}
