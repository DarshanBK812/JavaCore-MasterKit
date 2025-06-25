package problems.pattren.advance;

public class TriangleStarPattern {

	public static void main(String[] args) {
		int row = 6, space = row - 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			space--;
		}
	}

}
