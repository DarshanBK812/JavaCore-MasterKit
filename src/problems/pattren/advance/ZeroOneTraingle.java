package problems.pattren.advance;

//1 
//0 1 
//1 0 1 
//0 1 0 1 

public class ZeroOneTraingle {

	public static void main(String[] args) {
		int row = 4;
		int n1 = 1, n2 = 0;
		for (int i = 1; i <= row; i++) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					if (j % 2 != 0) {
						System.out.print(n1 + " ");
					} else {
						System.out.print(n2 + " ");
					}
				} else {
					if (j % 2 != 0) {
						System.out.print(n2 + " ");
					} else {
						System.out.print(n1 + " ");
					}
				}
			}

			System.out.println();
		}
	}

}
