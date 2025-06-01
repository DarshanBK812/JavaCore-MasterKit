package problems.number;

public class NeonNumber {

//	For example, 9 is a neon number because 9 squared (81) has digits that sum to 9 (8+1=9). 

	public static void main(String[] args) {

		int num = 10;
		int sqr = num * num;
		int sum = 0;
		while (sqr > 0) {
			sum = sum + sqr % 10;
			sqr /= 10;
		}
		if (sum == num)
			System.out.println("Neaon number");
		else
			System.out.println("Not a neaon number");

	}

}
