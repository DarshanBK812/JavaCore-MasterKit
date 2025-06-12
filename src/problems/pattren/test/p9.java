package problems.pattren.test;

public class p9 {
	
	public static boolean check(int num) {
		if(num  == 0 || num == 1) return false;
		if(num != 2 && num % 2 == 0) return false;
		else {
			for(int i = 3 ; i*i <= num ; i++) {
				if(num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int num = 2 ;
		System.out.println(check(num));
	}

}
