package problems.important;

public class Factorial_Using_Recursion {
	private static int fact(int num) {
		if(num>= 1) {
			
			return num * fact(num-1);
		} else {
			return 1 ;
		}
	}
	
	public static void main(String[] args) {
		int num = 3;
		System.out.println(fact(num));
	}

}
