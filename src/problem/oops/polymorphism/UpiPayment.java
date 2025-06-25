package problem.oops.polymorphism;

public class UpiPayment extends Payment {

	@Override
	public void pay(double money) {
		System.out.println("paid :" + money + " via upi");
	}

}
