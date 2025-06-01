package problems.number;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int num = 203;
		int rev = 0;

		while (num > 0) {
			rev = (num % 10) + rev * 10;
			num /= 10;
		}
		System.out.println(rev);
	}

}
