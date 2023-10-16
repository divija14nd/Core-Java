package corejava.oop;

public class TrainersActivity {

	public static void main(String[] args) {
		
		  Employee employee = new Employee(1L, "Amar", "123 Main St", 5555555555L, 50000.0);
	      Manager manager = new Manager(2L, "Ram", "456 Corner St", 5555555556L, 65000.0);
	      Trainee trainee = new Trainee(3L, "Shyam", "789 Circle St", 5555555557L, 45000.0);

	      employee.calculateSalary();
	      employee.transportAllowance();
	      System.out.println();

	      manager.transportAllowance();
	      manager.calculateSalary();
	      System.out.println();

	      trainee.transportAllowance();
	      trainee.calculateSalary();
	      System.out.println();
	}

}
