package problems.pattren;

import java.util.Iterator;

public class Diamond {
	
	public static void main(String[] args) {
		int row = 7 , val =4 , space = 0 ;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < val; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
			if(i <(row/2)) {
				space++;
				val--;
			} else {
				space--;
				val++;
			}
		}

	}
}
