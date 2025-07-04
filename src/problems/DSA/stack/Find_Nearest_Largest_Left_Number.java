package problems.DSA.stack;

import java.util.Arrays;
import java.util.Stack;

//Explanation:
//
//For 1 → no element to the left → -1
//
//For 3 → no greater element to the left → -1
//
//For 2 → nearest greater left is 3
//
//For 4 → no greater element to the left → -1


public class Find_Nearest_Largest_Left_Number {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 4 };

		int temp[] = new int[arr.length];

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}

			temp[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(arr[i]);
		}

		System.out.println(Arrays.toString(temp));//[-1, -1, 3, -1]
	}

}
