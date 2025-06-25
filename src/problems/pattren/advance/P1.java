package problems.pattren.advance;

//2

//4 6
//8 2 4 
//6 8 2 4 
//6 8 2 4 6

public class P1 {

	public static void main(String[] args) {
		int num = 2;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(num + " ");
				if (num < 8)
					num += 2;
				else
					num = 2;
			}

			System.out.println();

		}
	}

}
