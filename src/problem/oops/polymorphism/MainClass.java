package problem.oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
//		Payment paid = new Payment();
//		paid.pay(10.0);
//		paid.pay(10.0, "INR");
//		
//		Payment payment = new UpiPayment();
//		payment.pay(2.0);
//		Payment payment2 = new CardsPayment();
//		payment2.pay(3.0);

		try {
			Payment payment = new UpiPayment();
			UpiPayment upiPayment = (UpiPayment) payment;
			
			payment.pay(10.0);
		} catch (Exception e) {
			System.out.println("Class caste exception");
		}

	}

}
