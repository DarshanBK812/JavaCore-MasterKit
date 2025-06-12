package problems.important;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class The_Stock_Span_Problem {

	public static void main(String[] args) {
		int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
		Stack<Integer> stack = new Stack<Integer>();
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			
			temp[i] = stack.isEmpty() ? 1 : i - stack.peek() ;
 
			stack.push(i);
			
		}
		System.out.println(Arrays.toString(temp));
		
	}

}
