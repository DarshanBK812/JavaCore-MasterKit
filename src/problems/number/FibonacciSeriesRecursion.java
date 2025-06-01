package problems.number;

public class FibonacciSeriesRecursion {

	static int n1 = 0, n2 = 1;

	public static void fibonacci(int count) {
		if (count > 0) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			fibonacci(--count);
		} else
			return;
	}

	public static void main(String[] args) {

		int count = 8;

		System.out.print(n1 + " " + n2);

		fibonacci(count);

	}

}
