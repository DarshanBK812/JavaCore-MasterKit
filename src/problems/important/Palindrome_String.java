package problems.important;

public class Palindrome_String {

	public static boolean check(String str) {

		int left = 0, right = str.length() - 1;

		while (left < right) {

			while (!Character.isLetterOrDigit(str.charAt(left)))
				left++;

			while (!Character.isLetterOrDigit(str.charAt(left)))
				right++;

			if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(left))) {
				return false;
			}

			right--;

			left++;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "malayalam";

		System.out.println(check(str));
	}

}
