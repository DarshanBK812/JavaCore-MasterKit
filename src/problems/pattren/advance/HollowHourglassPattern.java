package problems.pattren.advance;

public class HollowHourglassPattern {

	public static void main(String[] args) {
		int row = 11, col = 11;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (j == i || (j + i) == row + 1 || (j % 2 != 0 && (i == 1 || i == col))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
