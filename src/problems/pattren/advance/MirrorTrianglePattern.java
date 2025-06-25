package problems.pattren.advance;

import java.util.Iterator;

public class MirrorTrianglePattern {

	public static void main(String[] args) {
		int row = 11, col = 6, space = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= col; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			if (i < (row + 1) / 2) {
				space++;
				col--;
			} else {
				space--;
				col++;
			}
		}
	}

}
