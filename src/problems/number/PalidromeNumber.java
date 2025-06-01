package problems.number;


//Examples:
//121, 1221, 5445 are all palindromes because they remain unchanged when reversed. 

public class PalidromeNumber {
	


	public static void main(String[] args) {
		int num = 13;
		int num2 = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}

		if (num2 == rev)
			System.out.println("Yes");
		else
			System.out.println("no");
	}

}
