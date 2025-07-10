package Day5_ProgrammingElements.Level1;
import java.util.*;

class Departments{
	String name;
	Departments(String name){
		this.name = name;
	}
	
	void showdepartment() {
		System.out.println("Department: "+ name);
	}
}

class Faculty{
	String name;
	ArrayList<Departments> departments = new ArrayList<>();
	Faculty(String name){
		this.name = name;
	}
	
	void addDepartment(Departments department) {
		departments.add(department);
	}
	
	void showDepartments() {
		System.out.println("Departments in faculty of " + name +" :");
		for(Departments d : departments) {
			System.out.println(d.name);
		}
	}
}

class University{
	String name;
	ArrayList<Faculty> faculties = new ArrayList<>();
	University(String name){
		this.name = name;
	}
	
	void addfaculty(Faculty faculty) {
		faculties.add(faculty);
	}
	
	void showFaculty() {
		System.out.println("faculty in university: " );
		for(Faculty f : faculties) {
			System.out.println(f.name);
		}
	}
	
	void showUniversityStructure() {
		System.out.println("University: "+ name);
		for (Faculty f : faculties) {
            f.showDepartments();
        }
	}
}
public class UniversitywithFacultiesandDepartments {

	public static void main(String[] args) {
		 University university = new University("GLA University");

	     Faculty faculty1 = new Faculty("Engineering");
	     Faculty faculty2 = new Faculty("Arts");

	     Departments dept1 = new Departments("Computer Science");
	     Departments dept2 = new Departments("Mechanical Engineering");
	     Departments dept3 = new Departments("History");
	     Departments dept4 = new Departments("Literature");

	     faculty1.addDepartment(dept1);
	     faculty1.addDepartment(dept2);
	     faculty2.addDepartment(dept3);
	     faculty2.addDepartment(dept4);

	     university.addfaculty(faculty1);
	     university.addfaculty(faculty2);

	     university.showFaculty();
	     university.showUniversityStructure();

	}

}
