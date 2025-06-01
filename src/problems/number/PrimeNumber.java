package problems.number;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 13;

		if (num == 0 || num == 1) {

			System.out.println("not a prime");
			return;

		} else if (num % 2 == 0) {

			System.out.println("not a prime number");
			return;

		} else {

			for (int i = 3; i * i <= num; i++) {

				if (i % 2 == 0) {

					System.out.println("not a prime number");
					return;

				}
			}
		}
		System.out.println("Prime number");
	}

}
