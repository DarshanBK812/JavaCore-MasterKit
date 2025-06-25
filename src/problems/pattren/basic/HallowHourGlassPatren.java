package problems.pattren.basic;

public class HallowHourGlassPatren {

	public static void main(String[] args) {

		int row = 7, val = 4, space = 0;
		for (int i = 1; i <= row; i++) {

//			for (int j = 1; j <= row; j++) {
//
//				if (i == 1 || i == row || i == j || (i + j) == row + 1) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			
			for (int j = 1; j <= row; j++) {
				if((j == 1 && i % 2 != 0)|| (j ==row && i % 2 != 0)|| (i == (row+1)/2 && j % 2 == 0)  ||(i == 1 && j % 2 != 0) || (i == row &&  j % 2 != 0 )|| i == j || (i+j) == row+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			if (i <= (row + 1) / 2) {
				space++;
				val--;
			} else {
				space--;
				val++;
			}
		}

	}

}
