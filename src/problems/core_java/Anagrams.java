package problems.core_java;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String str []) {
		String str1 = "darshan";
		String str2 = "arshand";
		if(str1.length() != str2.length()) {
			System.out.println("no");
			return;
		}
		
		char ch [] = str1.toCharArray();
		char ch2 [] = str2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
//		for (int i = 0; i < ch2.length; i++) {
//			if(ch[i] != ch[i]) {
//				System.out.println("not");
//				return;
//			}
//		} System.out.println("yes");
		
		System.out.println(Arrays.equals(ch, ch2) ? "yes " : "no");
	}

}
