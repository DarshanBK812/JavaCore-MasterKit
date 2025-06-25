package problems.pattren.advance;


//     *
//    **
//   ***
//  ****
// *****
//******


public class LeftHalfPyramidPattern {

	public static void main(String[] args) {
		int row = 6, col = 6;
		for (int i = 1; i <= row; i++) {
			for (int j = row - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
