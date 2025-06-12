package problems.pattren.test;

public class p10 {
	
	private static boolean check(int num) {
		String str = ""+num;
		char ch [] = str.toCharArray();
		int l = 0 , r = ch.length-1;
		while(l < r) {
			if(ch[l] != ch[r]) return false;
			l++;
			r--;
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 16761;
		
		System.out.println(check(num));
		
	}

}
