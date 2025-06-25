package problem.oops.abstraction;

public abstract class Bank {

	double accountBal = 10;

	public abstract void creditMoney(double money);

	public abstract void debitMoney(double money);

//
	public void getBal() {
		System.out.println(this.accountBal);
	}

}
