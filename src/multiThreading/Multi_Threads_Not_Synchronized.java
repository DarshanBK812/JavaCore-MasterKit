package multiThreading;

public class Multi_Threads_Not_Synchronized {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Transaction start ");

		Account_Not_Synchronized account = new Account_Not_Synchronized();

		Thread user1 = new Thread(() -> {

			for (int i = 0; i < 10; i++) {
				account.count++;
			}

		});

		Thread user2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				account.count++;
			}
		});

		user1.start();
		user2.start();

		user1.join();
		user2.join();

		System.out.println(account.count);

		System.out.println("Transaction ends");

	}

}
