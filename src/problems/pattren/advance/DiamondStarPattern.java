package problems.pattren.advance;

public class DiamondStarPattern {

	public static void main(String[] args) {
		int row = 11;
		int space = 5;
		int val = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= val; j++) {
				System.out.print("*");
			}

			System.out.println();
			if (i < (row + 1) / 2) {
				space--;
				val += 2;
			} else {
				space++;
				val -= 2;
			}
		}
	}

}
