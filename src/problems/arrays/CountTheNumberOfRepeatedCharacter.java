package problems.arrays;

import java.util.HashMap;

public class CountTheNumberOfRepeatedCharacter {

	public static void main(String[] args) {
		String str = "dArshan";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		
		for (char c : ch) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map);

	}

}
