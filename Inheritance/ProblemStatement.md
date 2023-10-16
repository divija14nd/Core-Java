Create a class Employee with following Instance variables and data types:
Instance            |Variable Data Type
employeeId 		    |     Long
employeeName 	    |     String
employeeAddress 	|     String
employeePhone 	    |     Long
basicSalary 		|     Double
specialAllowance 	|     Double 		default value- 2.5
Hra 			    |     Double 		default value- 10.5

a. Create an overloaded constructor in the employee class, which takes the below constructor parameters and initializes them to their respective instance variables.
Constructor parameter | Instance Variable
id 			          |   employeeId
name 			      |   employeeName
address 		      |   employeeAddress
phone 			      |   employeePhone
basicSalary 		  |   basicSalary

b. Create a method calculateSalary in which, salary needs to be calculated as below. 
salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100); 
The calculated salary should be displayed in the console. 
NOTE: salary is a local variable.

                 c.  Create two sub-classes called Manager and Trainee with base class Employee. 
Create overloaded constructors which takes the below parameters and initializes them to the respective variables in the super class
Constructor parameter | Instance Variable
id                    |   employeeId
name 		          |   employeeName
address 	          |   employeeAddress
phone                 |   employeePhone

d. Create a class “TrainersActivity.java” with a main method which creates Employee, Trainee and Manager objects and call the method calculateSalary.
e. Add a method called calculateTransportAllowance in Employee class which should calculate the transport
allowance by calculating 10% (default allowance)ofthe salary. Print the salary after calculating.
transportAllowance = 10/100*basicSalary.
f. For a manager, the transportation allowance is 15% of the basic salary. So override the calculateTransportAllowance method in Manager class which should calculate the transport allowance as 15%of the base salary.
Print the salary after calculating transport Allowance = 15*basicSalary /100.
g. For a trainee, the transport allowance is the same as the default allowance; the method calculateTransport Allowance in the base class can be used.
h. Invoke the calculateTransportAllowance for the manager and trainee class in the main method
of TrainersActivity.java.
