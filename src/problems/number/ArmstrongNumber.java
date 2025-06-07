package problems.number;

import java.util.Scanner;

//153: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 (Armstrong number) 
//370: 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370 (Armstrong number) 

public class ArmstrongNumber {
	static int count(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int num2 = num;
		double sum = 0;
		int count = count(num);
		while (num2 > 0) {
			sum = sum + Math.pow(num2 % 10, count);
			num2 /= 10;
		}
		if (sum == num)
			System.out.println("ArmStrong number");
		else
			System.out.println("not ");
	}

}
