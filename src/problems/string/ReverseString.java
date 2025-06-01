package problems.string;

public class ReverseString {

	public static void reverseTch1(String str) {
		char ch[] = str.toCharArray();
		int left = 0, right = ch.length - 1;
		while (left <= right) {
			char c = ch[left];
			ch[left] = ch[right];
			ch[right] = c;

			left++;
			right--;

		}
		String str2 = new String(ch);
		System.out.println(str2);
	}
	
	public static void reverseTch2(String str) {
		
		String str2 = "";
		
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			
			str2 += str.charAt(i);
		}
		System.out.println(str2);
	}

	public static void main(String[] args) {
		String str = "abc";
		reverseTch2(str);

	}

}
