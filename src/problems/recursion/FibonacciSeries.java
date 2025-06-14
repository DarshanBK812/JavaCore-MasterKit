package problems.recursion;

public class FibonacciSeries {
	
	static int num1 = 0 , num2 = 1;
	
	public static int feb(int count) {
		if(count <= 0) return 1;
		else {
			int num3 = num1 + num2;
			System.out.print(" "+ num3);
			num1 = num2;
			num2 = num3;
			return feb(count-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print(num1 + " " + num2);
		int count = 10;
		feb(count-2);
	}

}
