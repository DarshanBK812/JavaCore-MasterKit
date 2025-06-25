package problems.string;

//Given an integer N, generate a string of length N using lowercase letters a–z.
//If N > 26, repeat the alphabet."

public class StringBalance {

	public static boolean check(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return (sum % 2 == 0);
	}

	public static void generateCharacter(int n) {

		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder back1 = new StringBuilder();
		if (check(n)) {
			int i = 0;
			while (i < n / 2) {
				char ch = (char) ('a' + (i % 26));
				stringBuilder.append(ch);
				i++;
			}
			i = 0;
			while (i < n / 2) {
				char ch = (char) ('z' - (i % 26));
				stringBuilder.append(ch);
				i++;
			}
			stringBuilder.append(back1.reverse());
		} else {
			int i = 0;
			int front = (n - 1) / 2;
			int back = (n + 1) / 2;
			while (i < front) {
				char ch = (char) ('a' + (i % 26));
				stringBuilder.append(ch);
				i++;
			}
			i = 0;
			while (i < back) {
				char ch = (char) ('z' - (i % 26));
				stringBuilder.append(ch);
				i++;
			}
			stringBuilder.append(back1.reverse());
		}
		String str = "" + stringBuilder;
		System.out.println(str);

	}

	public static void main(String[] args) {
		int n = 4;
		generateCharacter2(n);
	}

	public static void generateCharacter2(int num) {

		StringBuilder builder = new StringBuilder();
		StringBuilder builder2 = new StringBuilder();

		if (check2(num)) {
			for (int i = 0; i < (num / 2); i++) {
				char ch = (char) ('a' + (i % 26));
				builder.append(ch);
			}
			for (int i = 0; i < (num / 2); i++) {
				char ch = (char) ('z' - (i % 26));
				builder.append(ch);
			}
			builder.append(builder2.reverse());
		}
		System.out.println(builder.toString());
	}

	public static boolean check2(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return (sum % 2 == 0);
	}
}
