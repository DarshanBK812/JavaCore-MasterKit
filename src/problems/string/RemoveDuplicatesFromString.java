package problems.string;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void remove(String str) {

		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count <= 1)
				System.out.println(ch[i]);
		}

	}

	public static void main(String[] args) {
		String str = "darshan";
		remove(str);
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>();
		for (char ch : str.toCharArray()) {
			linkedHashSet.add(ch);
		}

//		System.out.println(linkedHashSet);
		StringBuilder stringBuilder = new StringBuilder();
//		for (char ch : linkedHashSet) {
//			stringBuilder.append(ch);
//		}
//		Iterator<Character> iterator = linkedHashSet.iterator();
//		while (iterator.hasNext()) {
//			stringBuilder.append(iterator.next());
//		}
		for(char ch : linkedHashSet) {
			stringBuilder.append(ch);
		}
		System.out.println(stringBuilder);
	}

}
