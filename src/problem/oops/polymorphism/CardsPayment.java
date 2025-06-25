package problem.oops.polymorphism;

public class CardsPayment extends Payment {

	@Override
	public void pay(double m) {
		System.out.println("Paid " + m + " via car");
	}

}
