package problems.recursion;

//Print the 1 to 100 numbers without using the loops

public class PrintNumber {

	public static void print(int num) {
		if (num <= 100) {
			System.out.println(num++);
			print(num);
		} else
			return;
	}

	public static void main(String[] args) {
		int num = 1;
		print(num);
	}

}
