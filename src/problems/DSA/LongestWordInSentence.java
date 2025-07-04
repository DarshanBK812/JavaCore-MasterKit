package problems.DSA;


//✅ 10. Find the Longest Word in a Sentence
//
//> Return the word with the maximum length from a given string.
//📥 Input: "Java is super powerful" → 📤 Output: "powerful"


public class LongestWordInSentence {
	
	public static void main(String[] args) {
		String str = "Java is super powerful";
		String str2 [] = str.split(" ");
		String str3 = "";
		for (int i = 0; i < str2.length; i++) {
			if(str3.length() < str2[i].length()) {
				str3 = str2[i];	
			}
		}
		
		System.out.println(str3);
	}

}
