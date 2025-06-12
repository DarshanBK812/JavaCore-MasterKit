package problems.string;

public class StringPalidrome {

	public static void main(String[] args) {
		String str = "m1alay@alam^";

		int left = 0, right = str.length() - 1;
		while (left <= right) {

//			System.out.println(Character.isLetterOrDigit(str.charAt(left)) + " " + str.charAt(left) + " "
//					+ Character.isLetterOrDigit(str.charAt(right)) + " " + str.charAt(right));

			while (!Character.isLetter(str.charAt(right)) )
				right--;
			while (!Character.isLetter(str.charAt(left)) )
				left++;

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
