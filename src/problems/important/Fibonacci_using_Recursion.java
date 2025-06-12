package problems.important;

public class Fibonacci_using_Recursion {
	static int n1 = 0, n2 = 1;

	private static void feb(int count) {
		if (count >= 1) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			feb(count - 1);
		} else {
			return;
		}
	}

	public static void main(String[] args) {
		System.out.print(n1 + " " + n2);
		int count = 10;
		feb(count - 2);
	}

}
