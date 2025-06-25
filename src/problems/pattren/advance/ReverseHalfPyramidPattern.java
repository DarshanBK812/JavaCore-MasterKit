package problems.pattren.advance;


//******
//*****
//****
//***
//**
//*


public class ReverseHalfPyramidPattern {

	public static void main(String[] args) {
		int row = 6, col = 6;
		for (int i = 1; i <= row; i++) {
			for (int j = col; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
