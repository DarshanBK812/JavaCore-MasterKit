package problem.oops.problem1;

public class Car extends Vehicle {

	int numberOfDoors;

	public Car(int numberOfDoors, String make, String model, String year) {
		super(make, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		System.out.println("make :" + this.getMake() + " model :" + getModel() + " year :" + getYear());
		System.out.println("numberOfDoors : " + this.numberOfDoors);
	}

}
