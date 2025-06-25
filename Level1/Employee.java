package Level1;

public class Employee {
	private String name;
	private int id;
	private double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("Employee Details:");
		System.out.println("Name   : " + name);
		System.out.println("ID     : " + id);
		System.out.println("Salary : $" + salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Ayushi Verma", 101, 55000.0);
		emp.displayDetails();
	}
}
