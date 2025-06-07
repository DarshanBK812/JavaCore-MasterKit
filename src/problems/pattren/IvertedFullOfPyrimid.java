package problems.pattren;

public class IvertedFullOfPyrimid {

	public static void main(String[] args) {
		int row = 5, val = row;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j2 = 0; j2 < val; j2++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			val--;

		}
	}

}
