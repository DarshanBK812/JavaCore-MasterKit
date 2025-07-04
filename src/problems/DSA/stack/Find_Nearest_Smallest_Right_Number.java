package problems.DSA.stack;

//Explanation:
//
//3 → right: [7, 4, 15, 9] → no smaller → -1
//
//7 → right: [4, 15, 9] → 4 is nearest smaller → 4
//
//4 → right: [15, 9] → no smaller → -1
//
//15 → right: [9] → 9 is smaller → 9
//
//9 → right: [] → -1

import java.util.Arrays;
import java.util.Stack;

public class Find_Nearest_Smallest_Right_Number {

	public static void main(String[] args) {
		int arr[] = { 3, 7, 4, 15, 9 };

		int temp[] = new int[arr.length];

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}

			temp[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(arr[i]);
		}

		System.out.println(Arrays.toString(temp)); // [-1, 4, -1, 9, -1]
	}
}
