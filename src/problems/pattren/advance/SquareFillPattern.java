package problems.pattren.advance;

import java.util.Iterator;


//******
//******
//******
//******
//******
//******


public class SquareFillPattern {

	public static void main(String[] args) {
		int row = 6, col = 6;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
