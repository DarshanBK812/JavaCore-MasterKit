package problems.important;

import java.util.Iterator;
import java.util.Scanner;

public class GCD_of_Two_Numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the elements");

		int n1 = scanner.nextInt(), n2 = scanner.nextInt();

//		int max = n1 > n2 ? n1 : n2;
//		int min = n1 < n2 ? n1 : n2;

//		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

//		if (n1 > n2) {
//			max = n1;
//			min = n2;
//		} else if (n2 > n1) {
//			max = n2;
//			min = n1;
//		}

		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);

		int gcd = 1;
//		System.out.println(max/2);
		for (int i = 2; i <= min; i++) {

//			System.out.println("i " + i + " " + "n1 " +n1 + " " + "n2 " + n2);

//			System.out.println(n1 % i + " " +  n2 % i);
			if (n1 % i == n2 % i) {

				gcd = i;
			}
		}

		System.out.println("max " + max + " " + "min " + min);

		System.out.println("gcd " + gcd);

	}

}
