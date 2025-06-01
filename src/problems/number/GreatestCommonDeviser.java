package problems.number;

public class GreatestCommonDeviser {

	public static void main(String[] args) {
		int n1 = 9;
		int n2 = 18;

		int min;
		int max;

		if (n1 > n2) {
			max = n1;
			min = n2;

		} else {
			max = n2;
			min = n1;
		}

		int gc = 1;

		System.out.println(min + " " + max);

		for (int i = min; i <= max / 2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gc = i;
			}
		}
		System.out.println(gc);

	}

}
