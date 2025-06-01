package problems.number;

//123: 1 + 2 + 3 = 6 and 1 * 2 * 3 = 6 (Spy number) 
//1124: 1 + 1 + 2 + 4 = 8 and 1 * 1 * 2 * 4 = 8 (Spy number) 

public class SpyNumber {

	public static void main(String[] args) {
		
		int num = 12;
		
		int sum = 0;
		
		int multi = 1;
		
		while (num > 0) {
			
			sum += num % 10;
			
			multi *= num % 10;

			num /= 10;
		}

		if (sum == multi)
			System.out.println("It is a spy number");
		else
			System.out.println("It is not spy number");
	}

}
