package problems.number;

//28 is another perfect number: (1 + 2 + 4 + 7 + 14 = 28). 

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 2;
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (sum == num)
			System.out.println("Perferct number");
		else
			System.out.println("not a perfect number");
	}

}
