package multiThreading;

public class Multi_Threads_Synchronized {

	public static void main(String[] args) throws Throwable {

		Account_Synchronized money = new Account_Synchronized();
		System.out.println("Begin the transaction");
		System.out.println(money.money);

		// Using annamous function created 2 threads
//		Thread user1 = new Thread(() -> {
//			for (int i = 0; i < 10; i++) {
//				money.addMoney();
//			}
//		});
//
//		Thread user2 = new Thread(() -> {
//			for (int i = 0; i < 10; i++) {
//				money.addMoney();
//			}
//		});

		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				money.addMoney();
			}
		};

		Runnable runnable2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					money.addMoney();
				}
			}
		};

		Thread user1 = new Thread(runnable);
		Thread user2 = new Thread(runnable2);

		user1.start();
		user2.start();

		user1.join();
		user2.join();

		System.out.println("end the transaction");

		System.out.println(money.money);

//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				
//			}
//		};

	}

}
