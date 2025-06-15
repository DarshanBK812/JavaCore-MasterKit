package singleton;

public class Singleton_Class_Lazy_Loading_With_MultiThreading {

	private static volatile Singleton_Class_Lazy_Loading_With_MultiThreading class_Lazy_Loading_object_multitherad_object = null;

	private Singleton_Class_Lazy_Loading_With_MultiThreading() {

		System.out.println("singleton obect created by lazy loading" + Thread.currentThread().getName());
	}

	public static Singleton_Class_Lazy_Loading_With_MultiThreading createObject() {

		// Single checking
		if (class_Lazy_Loading_object_multitherad_object == null) {
			synchronized (Singleton_Class_Lazy_Loading_With_MultiThreading.class) {
				// double checking
				if (class_Lazy_Loading_object_multitherad_object == null) {
					class_Lazy_Loading_object_multitherad_object = new Singleton_Class_Lazy_Loading_With_MultiThreading();
				}
			}
		}

		return class_Lazy_Loading_object_multitherad_object;
	}

	public static void main(String args[]) throws InterruptedException {

		// Before multi threading cant able create a 2 object

//		Singleton_Class_Lazy_Loading_With_MultiThreading object1 = createObject();
//		Singleton_Class_Lazy_Loading_With_MultiThreading object2 = createObject();
//		System.out.println(object1.equals(object2));

		// After multi threading can create 2 object which is violating principle of
		// singleton

		Runnable run1 = () -> {
			Singleton_Class_Lazy_Loading_With_MultiThreading object1 = createObject();
		};

		Runnable run2 = new Runnable() {
			@Override
			public void run() {
				Singleton_Class_Lazy_Loading_With_MultiThreading object2 = createObject();
			}
		};

		Thread thread1 = new Thread(run1, "thread 1 created");
		Thread thread2 = new Thread(run2, "thread 2 cretaed ");
		thread1.sleep(50);
		thread2.sleep(50);
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		// Output for multi threaded without synchrounization:
		// singleton obect created by lazy loadingthread 1 created
		// singleton obect created by lazy loadingthread 2 cretaed

		// Do synchronization to avoid that with double check

	}

}
