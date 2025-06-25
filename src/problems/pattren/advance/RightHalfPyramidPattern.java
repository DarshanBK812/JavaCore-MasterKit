package problems.pattren.advance;

//*
//**
//***
//****
//*****
//******

public class RightHalfPyramidPattern {

	public static void main(String[] args) {
		int row = 6, col = 6;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (j <= i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
