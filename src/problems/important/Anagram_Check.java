package problems.important;

import java.util.Arrays;

// Input: s1 = “geeks”  s2 = “kseeg”
// Output: true
// Explanation: Both the string have same characters with same frequency. So, they are anagrams.

public class Anagram_Check {

	public static boolean check(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		char ch1[] = str1.toCharArray().toCharArray();
		char ch2[] = str2.toCharArray().toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1 , ch2);
	}

	public static void main(String[] args) {
		String str1 = "malayalam";
		String str2 = "malayalam";
		System.out.println(check(str1, str2));;
	}

}
