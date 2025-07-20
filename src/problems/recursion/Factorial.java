package problems.recursion;

public class Factorial {

	public static int fact(int num) {

		if (num == 1)

			return 1;

		else {

			return num * fact(num - 1);

		}
	}

	public static void main(String[] args) {
		int num = 3;
		System.out.println(fact(num));
	}

//	public static int fact2(int num) {
//		if (num < 0) {
//			return 1;
//		} else {
//			return num * fact(num - 1);
//		}
//	}

}
