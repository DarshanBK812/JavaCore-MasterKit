package problems.number;

public class FactorialNumber {
	
	//Using Recursion 

	public static void main(String[] args) {
		int num = 3;
		int fact = 1;
		while (num > 0) {
			fact *= num--;
		}
		System.out.println(fact);
	}

}
