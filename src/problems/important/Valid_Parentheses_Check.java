package problems.important;

import java.util.Stack;

public class Valid_Parentheses_Check {

	public static boolean check(String str) {

		Stack<Character> stack = new Stack<Character>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (pairCheck(stack.peek(), ch)) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}

	private static boolean pairCheck(char wife, char husband) {
		return ((wife == '(' && husband == ')') || (wife == '{' && husband == '}') || (wife == '[' && husband == ']'));

	}

	public static void main(String[] args) {
		
		String str = "({[]})";
		check(str);
	}

}
