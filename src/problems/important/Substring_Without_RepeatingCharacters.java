package problems.important;

import java.util.HashSet;
import java.util.Set;

public class Substring_Without_RepeatingCharacters {
	

	public static void count(String str) {
		Set<Character> set = new HashSet<>();
		int count = 0 , i = 0 , j = 0  , maxLen = 0;
		while(j < str.length()) {
			char ch = str.charAt(j);
			if(!set.contains(ch)) {
				set.add(ch);
				maxLen = Math.max(maxLen, j - i + 1);
				
			} else {
				i++;
				
			}
			j++;
		}
		
		System.out.println(maxLen);
	}

	public static void main(String[] args) {
		String str = "abcabcbb";
		count(str);
		
//		int count = 0;
//		int j = 0;
//
//		Set<Character> set = new HashSet<>();
//
//		for (int i = 0; i < str.length(); i++) {
//			count++;
//			if (set.contains(str.charAt(i))) {
//				count = i - j;
//				j++;
//
//			}
//			set.add(str.charAt(i));
//
//		}

//		System.out.println(count);
	}

}
