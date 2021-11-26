
public class EmployeeApp {
	public static void main(String[] args) {
		Employee john = new Employee("John", 1, 20000);
		Employee sam = new Employee("Sam", 1, 30000);
		Employee jack = new Employee("Jack", 2, 100000);
		
		Output.printInfo(john, 2);
		Output.printInfo(sam, 1);
		Output.printInfo(jack, 20);
		
		try {
			Employee johnClone = (Employee) john.clone();
			Output.printInfo(johnClone, 4);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
