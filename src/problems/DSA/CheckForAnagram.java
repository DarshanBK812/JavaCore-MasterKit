package problems.DSA;

import java.util.Arrays;

//> Return true if two strings are anagrams, else false.
//📥 Input: "listen", "silent" → 📤 Output: true

public class CheckForAnagram {

	public static boolean check(String str1, String str2) {
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		if (ch1.length != ch2.length)
			return false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < ch2.length; i++) {
			if (ch1[i] != ch2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		// Technique 1
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));

		// Technique 2
		System.out.println(check(str1, str2));
	}

}
