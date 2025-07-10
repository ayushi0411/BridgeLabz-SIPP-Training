package Day5_ProgrammingElements.Level1;
import java.util.*;
class Course{
	String name;
	ArrayList<student> students = new ArrayList<>();
	
	Course(String name){
		this.name = name;
	}
	
	void addstudent(student student) {
		students.add(student);
	}
	
	void showstudents() {
		System.out.println("Students in "+ name+":");
		for(student s:students) {
			System.out.println(s.name);
		}
	}
}

class student{
	String name;
	ArrayList<Course> courses = new ArrayList<>();
	student(String name){
		this.name = name;
	}
	
	void enroll(Course course) {
		courses.add(course);
		course.addstudent(this);
	}
	
	 void showCourses() {
	     System.out.println(name + " is enrolled in:");
	     for (Course c : courses) {
	         System.out.println("- " + c.name);
	     }
	 }
}

class School {
    String name;
    ArrayList<student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (student s : students) {
            System.out.println(s.name);
        }
    }
}
public class SchoolandStudentswithCourses {

	public static void main(String[] args) {
		School school = new School("ABC School");

        student s1 = new student("Ayesha");
        student s2 = new student("Ayushi");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.showStudents();

        s1.showCourses();
        s2.showCourses();

        c1.showstudents();
        c2.showstudents();

	}

}
