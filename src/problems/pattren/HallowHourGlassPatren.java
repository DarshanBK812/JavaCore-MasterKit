package problems.pattren;

public class HallowHourGlassPatren {

	public static void main(String[] args) {

		int row = 7, val = 4, space = 0;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= row; j++) {

				if (i == 1 || i == row || i == j || (i + j) == row + 1) {
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
