package problems.pattren.test;

public class P11 {

	private static void check(int num) {

		int sum = 0, fact = 1;

		while (num > 0) {
			int r = num % 10;
		
			sum += r;
			
			num /= 10;
		}
		
		System.out.println(sum );

	}

	public static void main(String[] args) {
		int num = 5;
		check(num);
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact*=i;
		}
		System.out.println("fact " + fact);

	}

}
