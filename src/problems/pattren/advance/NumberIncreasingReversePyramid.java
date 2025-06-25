package problems.pattren.advance;

import java.util.Iterator;

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
		int row = 4;
		for (int i = 1; i <= row; i++) {
			int num = 1;
			for (int j = row; j >= i; j--) {
				System.out.print(num++);
			}
			System.out.println();
		}
	}

}
