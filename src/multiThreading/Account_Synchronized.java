package multiThreading;

public class Account_Synchronized {

	int money = 0;

	public synchronized void addMoney() {
		money++;
	}

}
