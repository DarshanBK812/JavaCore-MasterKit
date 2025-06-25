package problems.pattren.advance;

public class ReverseTrianglePattern {

	public static void main(String[] args) {
		int row = 6, space = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			int k = i;
			for (int j = row + 1 - i; j >= 1; j--) {
				System.out.print(k++ + " ");
			}
			System.out.println();
			space++;
		}
	}

}
