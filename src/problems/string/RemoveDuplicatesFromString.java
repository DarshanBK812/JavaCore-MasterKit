package problems.string;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void remove(String str) {

	}

	public static void main(String[] args) {
		String str = "darshan";
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>();
		for (char ch : str.toCharArray()) {
			linkedHashSet.add(ch);
		}

		System.out.println(linkedHashSet);
		StringBuilder stringBuilder = new StringBuilder();
//		for (char ch : linkedHashSet) {
//			stringBuilder.append(ch);
//		}
		Iterator<Character> iterator = linkedHashSet.iterator();
		while(iterator.hasNext()) {
			stringBuilder.append(iterator.next());
		}
		System.out.println(stringBuilder);
	}

}
