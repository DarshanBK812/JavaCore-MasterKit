package problems.pattren.advance;

public class HollowReverseTrianglePattern {

	public static void main(String[] args) {
		int row = 6, col = 11, space = 0;
		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= col; j++) {
				if (i == 1 || j == i || (i+j) == col+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			space++;
		}
	}

}
