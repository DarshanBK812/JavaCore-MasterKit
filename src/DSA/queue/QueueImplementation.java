package DSA.queue;

public class QueueImplementation {

	int arr[] = new int[5];
	int front = -1;
	int rear = -1;

	public void enque(int data) {
		if (rear == arr.length - 1) {
			System.out.println("Over flow");
			return;
		}

		if (front == -1 && rear == -1) {
			front++;
			rear++;
			arr[rear] = data;
		} else {
			rear++;
			arr[rear] = data;
		}

	}

	public void deque() {
		if (front > rear) {
			System.out.println("Under flow");
			return;
		}

		int data = arr[front];
		arr[front] = 0;
		front++;
	}

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QueueImplementation implimetation = new QueueImplementation();
		implimetation.enque(1);
		implimetation.enque(2);
		implimetation.enque(3);
		implimetation.enque(4);
		implimetation.enque(5);
//		implimetation.enque(6);
		implimetation.display();
		implimetation.deque();
		implimetation.deque();
		implimetation.deque();
		implimetation.deque();
		implimetation.deque();
		implimetation.deque();
		implimetation.display();
	}

}
