package problems.string;

//Example Input:

//"Hello World! 123"

//Expected Output (Counts):
//Vowels: 3 (e, o, o)
//Consonants: 7 (H, l, l, W, r, l, d)
//Digits: 3 (1, 2, 3)
//Special Characters: 2 (! and space)

public class CountTheVowels_Consonents_Number_SpecialCharacter {

	public static void count(String str) {
		char ch[] = str.toCharArray();
		int vowel = 0, consonants = 0, special = 0, digits = 0;
		char c1 = 'a', c2 = 'z';
		for (int i = 0; i < ch.length; i++) {
			
			char c = ch[i];
			if(Character.isAlphabetic(c)){
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
						vowel++;
					} else {
						consonants++;
					}
			} else if(Character.isDigit(c)) {
				
				digits++;
				
			} else {
				if(c != ' ') 
					special++;
			}
			
		}
		System.out.println("Vowels " + vowel + " Consonants " + consonants + " Digits " + digits
				+ " Special Characters " + special);
	}

	public static void main(String[] args) {
		String str = "Hello World! 123";
		count(str);
	}

}
