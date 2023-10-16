package corejava.oop;
/*
 * 
Instance         | Variable Data Type
employeeId 		 |  Long
employeeName 	 |  String
employeeAddress  |  String
employeePhone    |  Long
basicSalary 	 |	Double
specialAllowance |	double 		default value- 2.5
Hra 			 |  double 		default value- 10.5
*
*/
public class Employee {

	private long employeeID;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	protected double basicSalary;
	private double specialAllowance = 2.5;
	private double Hra = 10.5;
	
	
	public Employee(long employeeID, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}
	
	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + ((basicSalary * Hra)/100);
		System.out.println("Salary for " + employeeID +", " + employeeName + " is " + salary);
	}
    public void transportAllowance() {
        double transportAllowance = (10.0 / 100) * basicSalary;
        System.out.println("Transport Allowance: " + transportAllowance);
    }
}
