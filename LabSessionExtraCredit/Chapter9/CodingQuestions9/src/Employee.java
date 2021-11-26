import java.text.NumberFormat;

public class Employee implements Printable, EmployeeType, Cloneable {
	private String name;
	private String employeeType;
	private double salary;
	
	public Employee(String name, int employeeType, double salary) {
		this.name = name;
		this.salary = salary;
		
		if(employeeType == FACULTY) {
			this.employeeType = "Faculty";
		}
		else if(employeeType == CLASSIFIED) {
			this.employeeType = "Classified";
		}
	}

	@Override
	public void print() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String formattedSalary = formatter.format(salary);
		System.out.println("Employee [name=" + name + ", employeeType=" + employeeType + ", salary=" + formattedSalary + "]");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
