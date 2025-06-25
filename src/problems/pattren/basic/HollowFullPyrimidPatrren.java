package problems.pattren.basic;

public class HollowFullPyrimidPatrren {

	public static void main(String[] args) {
		int row = 7, val = 1, space = row - 1;
		int n1 = 1 , n2 = 0;
		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= val; j++) {
				if(j%2 != 0) {
					System.out.print(n1);
				} else{
					System.out.print(n2);
				}
			}
			System.out.println();
			if(i <(row+1)/2) {
				space--;
				val+=2;
			} else {
				space++;
				val-=2;
			}
		}
	}

}
