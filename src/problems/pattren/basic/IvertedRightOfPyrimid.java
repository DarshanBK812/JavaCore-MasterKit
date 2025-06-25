package problems.pattren.basic;

public class IvertedRightOfPyrimid {

	public static void main(String[] args) {
		int row = 5, val = row;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= val; j++) {
				System.out.print("*");
			}
			System.out.println();
			val--;
		}

	}

}
