package problems.string;

//Input:
//A single string. For example: "hello"

//Output:
//The reversed string. For example: "olleh"

public class ReverseString {

	public static void reverseTch1(String str) {
		String str3[] = str.split(" ");
		if (str3.length == 1) {
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
			return;
		} else {
			String str2[] = str.split(" ");
			StringBuilder builder = new StringBuilder();
			for (int i = str2.length - 1; i >= 0; i--) {
				builder.append(str2[i]).append(" ");
			}
			System.out.println(builder);
			return;
		}

	}

	public static void reverseTch2(String str) {

		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			str2 += str.charAt(i);
		}
		System.out.println(str2);
	}

	public static void reverseAsentence(String str) {
		String[] str1 = str.split(" ");
		String str2 = "";
		StringBuilder builder = new StringBuilder();
		for (int i = str1.length - 1; i >= 0; i--) {
			builder.append(str1[i]).append(" ");
		}
		System.out.println(builder);
	}

	public static void main(String[] args) {
		String str = "java";
		reverseTch1(str);
//		reverseAsentence(str);

	}

}
