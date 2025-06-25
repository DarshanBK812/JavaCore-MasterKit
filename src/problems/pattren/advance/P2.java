package problems.pattren.advance;

//		1
//	   1 2
//	  1 2 3
//	 1 2 3 4
//	1 2 3 4 5

public class P2 {

	public static void main(String[] args) {
		int row = 5, val = 1, space = 4;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < val; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
			val++;
			space--;
		}

	}

}
