package problems.important;

public class Count_Vowels_and_Consonants {

	public static void count(String str) {
		
		char ch[] = str.toLowerCase().toCharArray();
		int vowels = 0;
		int consonent = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				vowels++;
			} else {
				consonent++;
			}
		}
		
		System.out.println("vowels " + vowels + " " + " consonents " + consonent) ;
		
	}

	public static void main(String args[]) {

		String str = "GeeksforGeeks";
		count(str);

	}

}
