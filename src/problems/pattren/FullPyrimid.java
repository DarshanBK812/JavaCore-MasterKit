package problems.pattren;

public class FullPyrimid {

	public static void main(String[] args) {
		int row = 5, val = 1, space = 4;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= val; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			val ++;
			space--;
		}
	}

}
