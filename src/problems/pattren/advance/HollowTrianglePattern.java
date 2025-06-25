package problems.pattren.advance;

public class HollowTrianglePattern {

	public static void main(String[] args) {
		int row = 6, col = 11, space = row - 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= col; j++) {
				if (j == 1 || i == row || j == i * 2 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			space--;

		}
	}

}
