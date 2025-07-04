package problems.DSA.stack;

import java.util.Arrays;
import java.util.Stack;

public class Find_Smallest_Left_Number {

	public static void main(String[] args) {
		int arr[] = { 3, 7, 4, 15, 9 };

		int temp[] = new int[arr.length];

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			temp[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(arr[i]);
		}

		System.out.println(Arrays.toString(temp));

	}
}
