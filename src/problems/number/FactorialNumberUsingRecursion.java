package problems.number;

public class FactorialNumberUsingRecursion {

	public static int recursion(int num) {
		if (num == 0)
			return 1;
		else
			return num * recursion(num - 1);

	}

	public static void main(String[] args) {
		int num = 4;
		System.out.println(recursion(num));
	}

}
