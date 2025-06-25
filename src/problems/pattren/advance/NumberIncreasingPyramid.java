package problems.pattren.advance;

import java.util.Iterator;

//1 
//1 2 
//1 2 3 
//1 2 3 4 

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		int row = 4;
		for (int i = 1; i <= row; i++) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num++ + " ");
			}

			System.out.println();
		}
	}

}
