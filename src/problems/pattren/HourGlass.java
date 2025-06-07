package problems.pattren;

import java.util.Iterator;

public class HourGlass {
	public static void main(String[] args) {
//		int row = 7 , val = 4 , space = 
		int row = 7, val = 4, space = 0;
//		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if (i == 1 || i == row || i == j || (i + j) == row + 1 || (i % 2 == 0 && j == (row+1)/ 2) ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
