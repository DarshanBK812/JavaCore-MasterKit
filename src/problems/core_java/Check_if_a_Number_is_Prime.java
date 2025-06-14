package problems.core_java;

public class Check_if_a_Number_is_Prime {
	
	public static void main(String[] args) {
		int num = 2;
		if(num == 0 || num == 1) {
			System.out.println("Its not a prime");
			return;
		} else if(num != 2 && num % 2 == 0) {
			System.out.println("Its not a prime");
		} else {
			for(int i = 3 ; i*i <= num ; i++) {
				if(num % i == 0) {
					System.out.println("It is not prime");
					return;
				}
			}
		}
		System.out.println("Prime ");
	}

}
