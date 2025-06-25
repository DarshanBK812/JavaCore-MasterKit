package problem.oops.polymorphism;

public class Payment {

	public void pay(double money) {
		System.out.println("Processing payment :" + money);
	}

	public void pay(double money, String currency) {
		System.out.println("Proceesing paymnet of " + currency + " " + money);
	}

}
