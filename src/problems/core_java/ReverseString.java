package problems.core_java;

public class ReverseString {

	public static void main(String[] args) {
		String str = "darshan";
		int left = 0 , right = str.length()-1;
		char ch [] = str.toCharArray();
		while(left<right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp ;
			left++;
			right--;
			
		}
		String str2 = new String(ch);
		System.out.println(str2);
	}
	
}
