package problems.important;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {

	public static void find(String str) {
		HashSet<Character> hashSet = new HashSet<Character>();
		char ch[] = str.toCharArray();
		int left = 0, maxLength = 0;
		for (int i = 0; i < ch.length; i++) {

			while (hashSet.contains(ch[i])) {
				hashSet.remove(ch[i]);
				left++;
			}

			hashSet.add(ch[i]);
			int currentLength = i - left + 1;
			maxLength = Math.max(maxLength, currentLength);

		}

		System.out.println(hashSet.size());
	}

	public static void find2(String str) {
		char ch[] = str.toCharArray();
		int count = 0;
		int l = 0, r = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			int j = l;
			while (j < ch.length - 1) {

			}
		}
	}

	public static void main(String[] args) {

		String str = "geeksforgeeks";

		find(str);
	}

}
