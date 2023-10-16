package corejava.oop;

public class Manager extends Employee{

	public Manager(long employeeID, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
		super(employeeID, employeeName, employeeAddress, employeePhone, basicSalary);
		
	}

	@Override
	public void transportAllowance() {
		
		double transportAllowance = (15.0 / 100) * basicSalary;
		System.out.println("Transport Allowance for Manager: " + transportAllowance);

	}
	

}
