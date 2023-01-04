package inheritanse;

public class Main {

	public static void main(String[] args) {
		Custumer custumer = new Custumer();
		Employee employee = new Employee();
		employee.age =5;
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustumerManager custumerManager = new CustumerManager();
		
		custumerManager.Add();
		employeeManager.BestEmployee();
		
		
		}
	

}
