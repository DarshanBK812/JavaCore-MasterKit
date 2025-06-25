package problems.pattren.advance;

public class ButterflyStarPattern {

	public static void main(String[] args) {
		int row = 12, col = 12;
		int space = 11;
		for (int i = 1; i <= 6; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//
//			for (int j = 1 + i; j <= space; j++) {
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}

			for (int j = 1; j <= col; j++) {
				if (j <= i || j >= col - i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
			space--;
		}
		space = 0;

		for (int i = 1; i <= 6; i++) {

			for (int j = 6 + 1 - i; j >= 1; j--) {
				System.out.print("*");
			}
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (int j = 6 + 1 - i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
			space += 2;
		}
	}

}
