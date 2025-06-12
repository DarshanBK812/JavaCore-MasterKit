package problems.pattren.test;

public class Employee {

	int empId;
	String empName;
	double empSal;

	public Employee(int empId, String empName, double empSal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
