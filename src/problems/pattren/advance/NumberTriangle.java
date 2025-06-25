package problems.pattren.advance;

//		1 
//	   2 2 
//	  3 3 3 
//   4 4 4 4 

public class NumberTriangle {

	public static void main(String[] args) {
		int row = 4;
		int space = 3;
		int val = 1;
		int num = 1;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= val; j++) {

				System.out.print(num + " ");

			}
			System.out.println();
			num++;
			val += 1;
			space--;
		}
	}

}
