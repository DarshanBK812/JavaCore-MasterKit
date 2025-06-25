package problems.pattren.basic;

import java.util.Iterator;

//	 *
//   *   *
// *      *
//*     	 *
// *   	*
//  *   *
//	*

public class HollowDiamondPyrimidPatrren {

	public static void main(String[] args) {
		int row = 7, space = 3, val = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= val; j++) {
				if (j == 1 || j == val) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i < (row + 1) / 2) {
				space--;
				val += 2;
			} else {
				space++;
				val -= 2;
			}
		}

	}
}
