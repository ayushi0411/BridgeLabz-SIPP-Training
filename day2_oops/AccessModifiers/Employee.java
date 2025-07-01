package AccessModifiers;
class Employees {
    public int employeeID;
    protected String department;
    private double salary;

    public Employees(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employees {
    private String level;

    public Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    public void displayManager() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
        System.out.println("Salary: ₹" + getSalary());
    }
}

public class Employee {
    public static void main(String[] args) {
        Employees emp = new Employees(101, "IT", 40000);
        emp.displayEmployee();
        emp.setSalary(45000);
        System.out.println("\nUpdated Salary: ₹" + emp.getSalary());

        System.out.println();
        Manager mgr = new Manager(201, "HR", 70000, "Senior");
        mgr.displayManager();
    }
}
