package problems.important;

import java.util.Arrays;

public class Anagram_Check {

	public static boolean check(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < ch2.length; i++) {
			if (ch1[i] != ch2[i])
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String str1 = "malayalam";
		String str2 = "malayalam";
		System.out.println(check(str1, str2));;
	}

}
