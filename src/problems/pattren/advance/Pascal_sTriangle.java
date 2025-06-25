package problems.pattren.advance;

public class Pascal_sTriangle {

	public static void main(String[] args) {
		int row = 4, space = row - 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			int x = 1;
			for (int j = 1; j <= i; j++) {
			
				System.out.print( x+ " ");
				  x = x * (i - j) / j;
			}
			System.out.println();
			space--;
		}
	}

}
