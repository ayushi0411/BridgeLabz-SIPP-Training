package Day3_Programs;
import java.util.*;
class Course{
	String name;
	Course(String name){
		this.name = name;
	}
	void showCourse() {
		System.out.println("Courses: "+ name);
	}
}
class Enrollment{
	ArrayList<Course> courses = new ArrayList<>();
	void addCourse(Course course) {
		courses.add(course);
	}
	void showCourse() {
		System.out.println("Enrolled Courses: ");
		for(Course c: courses) {
			System.out.println(c.name);
		}
	}
}
class Student {
	String name;
	double marks;
	private double gpa;
	ArrayList<Enrollment> enrollments = new ArrayList<>();
	Student(String name, double marks){
		this.name = name;
		this.marks = marks;
		this.gpa = gpaCalculation(marks);
	}
	void addEnrolledCourse(Enrollment enrollement) {
		enrollments.add(enrollement);
	}	
	void showEnrolledCourse() {
		System.out.println("Courses enrolled by student "+ name+ ": ");
		for(Enrollment e: enrollments) {
			e.showCourse();
		}
	}
	private double gpaCalculation(double marks) {
		return marks / 10.0;
	}
	public double getGPA() {
        return gpa;
    }
	void showGrade() {
		System.out.println("The grades " + name +" got : ");
	
		Faculty faculty = new Faculty(gpa);
		String grade = faculty.assignGrade();
		System.out.println(grade);
	}
}
interface grade{
	String assignGrade();
}
class Faculty implements grade{
	private double gpa;
	public double getGPA() {
		return gpa;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	Faculty(double gpa){
		this.gpa = gpa;
	}
	@Override
	public  String assignGrade() {
		if(gpa >= 9) {
			return "A";
	    }else if(gpa >=7.5) {
	    	return "B";
	    }else if(gpa >=6) {
	    	return "C";
	    }else {
	    	return "D";
	    }
	}
 }
class UnderGraduate extends Student{

	UnderGraduate(String name, double marks) {
		super(name, marks);
	}
}
class PostGraduate extends Student{

	PostGraduate(String name, double marks) {
		super(name, marks);
	}
}
public class UniversityCourseEnrollmentSystem {
	public static void main(String[] args) {
		Student ug1 = new UnderGraduate("Ayesha", 20);
		Student ug2 = new UnderGraduate("Amaira", 90);
		Student pg1 = new PostGraduate("Ram", 80);
		Student pg2 = new PostGraduate("Raya", 56);
		Course c1 = new Course("Maths");
		Course c2 = new Course("Science");
		Enrollment e1 = new Enrollment();
		Enrollment e2 = new Enrollment();
		e1.addCourse(c2);
		e1.showCourse();
		e2.addCourse(c1);
		e2.showCourse();
		System.out.println();
		
		System.out.println("UNDERGRADUATE STUDENTS : ");
		ug1.addEnrolledCourse(e1);
		ug1.showEnrolledCourse();
		ug1.showGrade();
		System.out.println();
		
		ug2.addEnrolledCourse(e2);
		ug2.showEnrolledCourse();
		ug2.showGrade();
		System.out.println();
		
		System.out.println("POSTGRADUATE STUDENTS : ");
		pg1.addEnrolledCourse(e2);
		pg1.showEnrolledCourse();
		pg1.showGrade();
		System.out.println();
		pg2.addEnrolledCourse(e1);
		pg2.showEnrolledCourse();
		pg2.showGrade();
	}
}

