package Day5_ProgrammingElements.Level1;
import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees;

    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            emp.display();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (dept.name.equals(deptName)) {
                return dept;
            }
        }
        return null;
    }

    void displayStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }

    void dissolveCompany() {
        departments.clear();
        System.out.println("Company " + name + " has been dissolved. All departments and employees are removed.");
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        company.addDepartment("HR");
        company.addDepartment("Engineering");

        Department hr = company.getDepartment("HR");
        Department eng = company.getDepartment("Engineering");

        if (hr != null) {
            hr.addEmployee("Anya");
            hr.addEmployee("Ashi");
        }

        if (eng != null) {
            eng.addEmployee("Chanchal");
            eng.addEmployee("Daya");
        }

        company.displayStructure();
        company.dissolveCompany();
    }
}
