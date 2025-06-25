package problems.pattren.advance;

public class PalidroneTriangleNumber {

	public static void main(String[] args) {
		int row = 6;
		int space = row - 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print((j) + " ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print((j) + " ");
			}
			System.out.println();
			space--;
		}
	}

}
