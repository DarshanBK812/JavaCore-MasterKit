package DSA.queue.dequeu;

public class DequeuImplementation {

	int arr[] = new int[5];
	int rear = -1;
	int front = -1;

	public void inserFront(int data) {

		if (rear == -1 || front == -1) {
			rear++;
			front++;
			arr[rear] = data;
		} else if (front >= 0 && arr[front] == 0) {
			arr[front] = data;
			front--;
		}
	}

	public void insertRear(int data) {

		if (rear == arr.length - 1) {
			System.out.println("Over flow");
			return;
		}

		if (rear == -1 || front == -1) {
			rear++;
			front++;
			arr[rear] = data;
		} else if (arr[rear + 1] == 0) {
			arr[++rear] = data;

		}
	}

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		DequeuImplementation dequeuImplementation = new DequeuImplementation();
		dequeuImplementation.inserFront(1);
		dequeuImplementation.display();
		dequeuImplementation.insertRear(5);
		dequeuImplementation.inserFront(123);
		dequeuImplementation.display();
	}

}
