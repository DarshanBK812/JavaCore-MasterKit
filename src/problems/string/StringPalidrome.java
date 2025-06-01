package problems.string;

public class StringPalidrome {

	public static void main(String[] args) {
		String str = "malay@alam^";

		int left = 0, right = str.length() - 1;
		while (left <= right) {

			while (!Character.isLetterOrDigit(str.charAt(right)))
				right--;
			while (!Character.isLetterOrDigit(str.charAt(left)))
				left--;

			if (str.charAt(left) != str.charAt(right)) {
				System.out.println("Not a palidrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println("Palidrome String");
	}

}
