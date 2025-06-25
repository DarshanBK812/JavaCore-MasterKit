package DSA.stack;

import java.util.Scanner;

public class StackImplementation {

	Scanner scan = new Scanner(System.in);
	int arr[] = new int[5];
	int top = -1;

	public void push(int data) {
		if (top == arr.length - 1) {
			System.out.println("Stack is overflow");
			return;
		}

		arr[++top] = data;

	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is under flow");
			return;
		}
		int poped = arr[top];
		arr[top] = 0;
		top--;
	}

	public void peek() {
		System.out.println(arr[top]);
	}

	public void isEmpty() {
		if (top < arr.length - 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public void isFull() {
		if (top == arr.length - 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public void displayStack() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		StackImplementation implimention = new StackImplementation();
		implimention.push(1);
		implimention.push(2);
		implimention.push(3);
		implimention.push(4);
		implimention.push(5);
//		implimention.push(6);
		implimention.displayStack();
		implimention.pop();
		System.out.println();
		implimention.displayStack();
		System.out.println();
		implimention.peek();
		implimention.isEmpty();
		implimention.isFull();

	}

}
