package problems.number;

public class AutoMorphicNumber {

//	5 is automorphic because 5² = 25, and 25 ends with 5. 
//	6 is automorphic because 6² = 36, and 36 ends with 6. 

	public static void main(String[] args) {

		int num = 5;

		int sqr = num * num;

		boolean b = true;

		while (num > 0) {

			if (num % 10 != sqr % 10) {
				System.out.println(num + " " + sqr);
				b = false;
				break;
			}
			num /= 10;
			sqr /= 10;
		}
		if (b)
			System.out.println(" automorphic number");
		else
			System.out.println("Not a automorphic number");

	}
}
