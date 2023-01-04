package rInheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		employee.salary= 5000;
		
		CustumerManager custumerManager = new CustumerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.BestEmployee();
		custumerManager.List();
		
	}

}
