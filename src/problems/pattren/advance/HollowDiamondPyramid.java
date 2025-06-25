package problems.pattren.advance;

public class HollowDiamondPyramid {

	public static void main(String[] args) {
		int row = 11;
		int col = 1;
		int space = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= col; j++) {
				if (j == 1 || j == col) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

			if (i < (row + 1) / 2) {
				space--;
				col += 2;
			} else {
				space++;
				col -= 2;
			}
		}
	}

}
