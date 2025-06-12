package problems.pattren.test;

public class P13 {
	
	private static  void revese(int num) {
		
		int res = 0;
		int num2 = num;
		while(num2 > 0) {
			
			res = res*10 + num2 % 10;
			
			num2 /= 10;
		}
		System.out.println(res);
		
	}
	
	public static void main(String[] args) {
		int num = 1234;
		revese(num);
		
	}

}
