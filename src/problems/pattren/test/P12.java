package problems.pattren.test;

public class P12 {
	
	private static  void perfect(int num) {
			int sum = 0;
			
			for (int i = 1; i <=num/2 ; i++) {
				
				if(num % i == 0) {
					sum += i;
				}
			}
			
			if(sum == num) System.out.println("yes");
			else System.out.println("no");
	}
	
	public static void main(String[] args) {
		int num = 496;
		
		perfect(num);
	}
	

}
