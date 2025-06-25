package problem.oops.abstraction;

public class Main {
	
	public static void main(String[] args) {
		Bank atm = new Atm();
		atm.getBal();
		atm.creditMoney(10.0);
		atm.getBal();
	}

}

//“In this example, Bank is an abstract class with hidden logic for balance updates. The real logic is implemented in Atm.
//The user interacts with Bank’s interface but doesn’t see the actual implementations,
//which is the core idea of abstraction — hiding internal details and showing only essential features.”