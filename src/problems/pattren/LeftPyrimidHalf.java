package problems.pattren;

import java.util.Iterator;

public class LeftPyrimidHalf {

	public static void main(String[] args) {
		int row = 5 , space  = 4 , val = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j =1; j <= val; j++) {
				System.out.print("*");
			}
			System.out.println();
			val++;
			space--;
			
			
			
			
		}
	}

}
