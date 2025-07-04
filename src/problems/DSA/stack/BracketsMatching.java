package problems.DSA.stack;

import java.util.Stack;

public class BracketsMatching {

	public static boolean check(String str) {
		char ch[] = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{') {
				stack.push(ch[i]);
			} else if (ch[i] == ')' || ch[i] == ']' || ch[i] == '}') {
				if (bracketsCheck(stack.peek(), ch[i])) {
					stack.pop();
				} else
					return false;

			}
		}
		return true;
	}

	public static boolean bracketsCheck(char open, char cloes) {
		return (open == '(' && cloes == ')') || (open == '{' && cloes == '}') || (open == '[' && cloes == ']');

	}

	public static void main(String[] args) {
		String str = "[{()}]";

		if (check(str))
			System.out.println("Matching");
		else
			System.out.println("not ");
	}

}
