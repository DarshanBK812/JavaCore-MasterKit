package problems.important;

import java.util.LinkedHashMap;
import java.util.Map;

public class Find_First_Non_Repeating_Character {

	private static void find(String str) {

		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {

			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);

		}

		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {

			if (entry.getValue() == 1) {

				System.out.println(entry.getKey());

				break;
			}
		}

	}

	public static void main(String[] args) {

		String str = "ddarasdsvn";

		find(str);
	}

}
