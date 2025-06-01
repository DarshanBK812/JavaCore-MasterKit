package problems.number;

//For example, 145 is a Peterson number because:
//1! + 4! + 5! = 1 + 24 + 120 = 145

public class PeterNumber {

	public static void main(String[] args) {
		int num = 14;
		int num2 = num;
		int sum = 0;
		while (num2 > 0) {
			int factSum = 1;
			for (int i = 1; i <= num2 % 10; i++) {
				factSum *= i;
			}
			sum += factSum;
			num2 /= 10;
		}

		if (sum == num)
			System.out.println("Peterson number");
		else
			System.out.println("not Peterson number");
	}

}
