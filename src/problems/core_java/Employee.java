package problems.core_java;

public class Employee {

	String name;
	double sal;

	public Employee(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}

	public String toString() {
		return "Name :" + name + " and sal :" + sal;
	}

}
