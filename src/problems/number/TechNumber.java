package problems.number;

//	A "Tech Number" is a specific type of number with an even number of digits.
//	It's characterized by the property that when you split the number into two equal halves,
// 	and then sum those halves, the square of that sum equals the original number. For example, 
//	3025 is a Tech Number because (30 + 25)² = 3025. 

public class TechNumber {

	static int count(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	static boolean checkTeck(int num, int count) {
		
		int sum = 0;
		int key = 1;
		for (int i = 1; i <= count / 2; i++) {
			key *= 10;
		}
		sum = (num / key) + (num % key) ;
		
		sum = sum * sum;
		System.out.println(sum);
		if (sum == num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num = 3025;
		if (4 != count(num) ) {
			System.out.println("Not a tech number 1");
		} else {
			if (checkTeck(num, count(num)))
				System.out.println("Tech number");
			else
				System.out.println("Not a tech number 2");

		}
	}

}
