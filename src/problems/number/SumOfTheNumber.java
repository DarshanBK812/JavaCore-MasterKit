package problems.number;

public class SumOfTheNumber {

	public static void main(String[] args) {
		int num = 12;
		int sum = 0;
		while (num > 0) {

			sum = num % 10 + sum;
			num /= 10;
		}

		System.out.println(sum);
	}

}
