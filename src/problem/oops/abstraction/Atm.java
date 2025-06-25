package problem.oops.abstraction;

public class Atm extends Bank {

	@Override
	public void creditMoney(double money) {
		this.accountBal = accountBal + money;
	}

	@Override
	public void debitMoney(double money) {
		this.accountBal = accountBal - money;
	}

}
