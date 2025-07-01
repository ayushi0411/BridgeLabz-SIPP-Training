package day3_oops;
class Employees {
    String name;
    final int id;
    String designation;

    static String companyName = "TechSoft Solutions";
    static int totalEmployees = 0;

    public Employees(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayDetails() {
        if (this instanceof Employees) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class Employee {
    public static void main(String[] args) {
        Employees e1 = new Employees("Ayushi Verma", 101, "Developer");
        Employees e2 = new Employees("Sneha Verma", 102, "Designer");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();

        Employees.displayTotalEmployees();
    }
}
