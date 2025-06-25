package problems.pattren.advance;

import java.util.Iterator;

public class RhombusPattern {

	public static void main(String[] args) {
		int row = 6;

		for (int i = 1; i <= row; i++) {
			for (int j = row - 1 + i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
