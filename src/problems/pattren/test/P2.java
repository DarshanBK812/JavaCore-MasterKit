package problems.pattren.test;

public class P2 {
	
	public static void main(String[] args) {
		String str = "bhavana";
		char ch [] = str.toCharArray();
		int l = 0 , right = ch.length-1;
		while(l<right) {
			char c = ch[l];
			ch[l] = ch[right];
			ch[right] = c;
			l++;
			right--;
		}
		
		String string = new String(ch);
		System.out.println(string);
	}

}
