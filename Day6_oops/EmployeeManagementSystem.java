package Day6_ProgrammingElement;
import java.util.*;
abstract class Employee{
	int employeeId;
	String name;
	double baseSalary;
	
	Employee(int employeeId, String name, double baseSalary){
		this.employeeId = employeeId;
		this.baseSalary = baseSalary;
		this.name = name;
	}
	
	public int getemployeeid() {
		return employeeId;
	}
	
	public void setemployeeid(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getbaseSalary() {
		return baseSalary;
	}
	
	public void setbaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public abstract double calculateSalary();
	
	public void displaydetails() {
		System.out.println("Name: "+ name);
		System.out.println("Employee Id: "+ employeeId);
		System.out.println("Base slary: "+ baseSalary);
		System.out.println("Calaculated salary: "+ calculateSalary());
		System.out.println();
	}
}

interface Department{
	void assignDepartment(String departmentName);
	String getDepartmentdetails();
}

class FullTimeEmployee extends Employee implements Department{
	private String departmentName;
	public FullTimeEmployee(int employeeId, String name, double baseSalary) {
		super(employeeId, name, baseSalary);
	}
	@Override
	public double calculateSalary() {
		return 100000 + baseSalary;
	}
     

	public void assignDepartment(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getDepartmentdetails() {
		return "Department: " + departmentName;
	}
    
	public void departmentdetails() {
		super.displaydetails();
		System.out.println(getDepartmentdetails());
		System.out.println();
	}
}

class PartTimeEmployee extends Employee implements Department{
    private String departmentName;
    private int hoursWorked;
    private double hourlyRate;
	PartTimeEmployee(int employeeId, String name,  int hoursWorked, double hourlyRate) {
		super(employeeId, name, 0);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	@Override
	public void assignDepartment(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String getDepartmentdetails() {
		return "Department: " + departmentName;
	}
	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}
	
	public void displayDetails() {
        super.displaydetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println(getDepartmentdetails());
        System.out.println();
    }
}
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		FullTimeEmployee ft = new FullTimeEmployee(123, "Ayesha", 20000);
		ft.assignDepartment("IT");
		
		PartTimeEmployee pt = new PartTimeEmployee(231, "Rashi", 50, 100);
		pt.assignDepartment("IT");
		
		employees.add(pt);
		employees.add(ft);
		for(Employee emp :employees) {
			emp.displaydetails();
		}
	}

}
