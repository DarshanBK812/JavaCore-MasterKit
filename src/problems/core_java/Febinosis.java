package problems.core_java;

public class Febinosis {
	
	static int n1 = 0 , n2 = 1;
	
	public static int feb(int n) {
		if(n <= 0) return 1;
		else {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			return feb(n-1);
		}
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.print(n1 + " " + n2);
		feb(n-2);
	}

}
