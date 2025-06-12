package problems.pattren.test;

public class P4 {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
					System.out.println("Runnable thread is running");
			}
		});
		thread.start();
	}

}
