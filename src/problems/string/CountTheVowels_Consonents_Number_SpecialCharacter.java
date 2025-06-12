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
			char c = Character.toLowerCase(ch[i]);

			System.out.println("char 1 : " + c + " :" + Character.isLetterOrDigit(c));
			if (Character.isLetterOrDigit(c)) {

				System.out.println("char 2 : " + c + " :" + Character.isAlphabetic(c));
				System.out.println();

				if (Character.isAlphabetic(ch[i])) {
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
						vowel++;
					} else {
						consonants++;
					}
				} else {
					digits++;
				}
			} else {
				if (c == ' ')
					continue;
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
