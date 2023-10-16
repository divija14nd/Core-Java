Create a class Employee with following Instance variables and data types:<br />
|  Instance            |   Variable Data Type                | 
|----------------------|-------------------------------------|
|employeeId 		       |     Long                            |
|employeeName 	       |     String                          |
|employeeAddress     	 |     String                          |
|employeePhone 	       |     Long                            |
|basicSalary 		       |     Double                          |
|specialAllowance      |     Double 		default value- 2.5   |
|Hra 			             |     Double 		default value- 10.5  |
<br />
a. Create an overloaded constructor in the employee class, which takes the below constructor parameters and initializes them to their respective instance variables.<br />

| Constructor parameter | Instance Variable |
|-----------------------|-------------------|
|id 			              |   employeeId      |
|name 			            |   employeeName    |
|address 		            |   employeeAddress |
|phone 			            |   employeePhone   | 
|basicSalary 		        |   basicSalary     |
<br />
b. Create a method calculateSalary in which, salary needs to be calculated as below. <br />

---
Salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100)
---
           
<br />
The calculated salary should be displayed in the console. <br />
NOTE: salary is a local variable.<br />
<br />
c. Create two sub-classes called Manager and Trainee with base class Employee. <br />
Create overloaded constructors which takes the below parameters and initializes them to the respective variables in the super class<br />

| Constructor parameter | Instance Variable |
|-----------------------|-------------------|
|id 			              |   employeeId      |
|name 			            |   employeeName    |
|address 		            |   employeeAddress |
|phone 			            |   employeePhone   | 

<br />
d. Create a class “TrainersActivity.java” with a main method which creates Employee, Trainee and Manager objects and call the method calculateSalary.<br />

e. Add a method called calculateTransportAllowance in Employee class which should calculate the transport
allowance by calculating 10% (default allowance)ofthe salary. Print the salary after calculating.

---
For Employee: transportAllowance = 10/100* basicSalary
---
<br />

f. For a manager, the transportation allowance is 15% of the basic salary. So override the calculateTransportAllowance method in Manager class which should calculate the transport allowance as 15% of the base salary.<br />
Print the salary after calculating 

---
For Manager: transport Allowance = 15 * basicSalary /100
---
<br />

g. For a trainee, the transport allowance is the same as the default allowance; the method calculateTransport Allowance in the base class can be used.<br />

h. Invoke the calculateTransportAllowance for the manager and trainee class in the main method
of TrainersActivity.java.
