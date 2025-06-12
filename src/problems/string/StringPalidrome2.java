package problems.string;

//1. Reverse a String
//Question: Write a Java program to reverse a given string.
//
//Example Input:
//"hello"
//"Java"
//
//Expected Output:
//"olleh"
//"avaJ"
//
//Explanation/Approach Hint: You can achieve this in several ways:
//
//Using a for loop to iterate backwards and build a new string.
//Converting the string to a char array, reversing the array, and then converting it back to a string.
//Leveraging the StringBuilder class's reverse() method (often the most efficient for mutable string operations).
//2. Check if a String is a Palindrome
//Question: Write a Java program to check if a given string is a palindrome. A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward, ignoring case and non-alphanumeric characters.
//
//Example Input:
//"madam"
//"A man, a plan, a canal: Panama"
//"hello"
//
//Expected Output:
//true
//true
//false

public class StringPalidrome2 {

	private static boolean check(String str) {
		char ch[] = str.toCharArray();
		int left = 0, right = ch.length - 1;
		while (left < right) {
			while (!Character.isLetterOrDigit(ch[left]))
				left++;
			while (!Character.isLetterOrDigit(ch[right]))
				right--;

			if (Character.toLowerCase(ch[left]) != Character.toLowerCase(ch[right])) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(check(str));
	}

}
