package Day4_ProgrammingElements.Introduction;

class Employee{
	String name;
	int id;
	double salary;
	
	Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
	
	void displaydetails() {
		System.out.println("Name: "+ name);
		System.out.println("ID: "+ id);
		System.out.println("Salary: "+ salary);
		
	}
}

class Manager extends Employee{
	int teamSize;
	
	Manager(String name, int id, double salary, int teamsize){
		super(name, id, salary);
		this.teamSize = teamsize;
	}
	
	void displaydetails() {
		super.displaydetails();
		System.out.println("TeamSize: "+ teamSize);
		System.out.println();
	}
}

class Developer extends Employee{
	String programmingLanguage;
	
	Developer(String name, int id, double salary, String programmingLanguage){
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	void displaydetails() {
		super.displaydetails();
		System.out.println("Programming Language: "+ programmingLanguage);
		System.out.println();
	}
}

class Intern extends Employee{
	int duration;
	
	Intern(String name, int id, double salary, int duration){
		super(name, id, salary);
		this.duration = duration;
	}
	
	void displaydetails() {
        super.displaydetails();
        System.out.println("Internship Duration: " + duration + " months");
        System.out.println();
    }
}
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Employee manager = new Manager("Aryan", 101, 90000, 10);
        Employee developer = new Developer("Bobby", 102, 80000, "Java");
        Employee intern = new Intern("Akash", 103, 20000, 6);

        System.out.println("=== Manager Details ===");
        manager.displaydetails();

        System.out.println("=== Developer Details ===");
        developer.displaydetails();

        System.out.println("=== Intern Details ===");
        intern.displaydetails();

	}

}
