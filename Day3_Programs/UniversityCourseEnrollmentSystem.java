package Day3_Programs;
import java.util.*;

interface grade{
	String assignGrade(double gpa);
}

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
		gpa= marks / 100;
		return gpa;
	}
	 void showGrade() {
		 System.out.println("The grades you got : ");
		 Faculty faculty = new Faculty();
		 String grade = faculty.assignGrade(gpa);
		 System.out.println(grade);
	 }
}

class Faculty implements grade{
	
	@Override
	public  String assignGrade(double gpa) {
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
		Course c1 = new Course("Maths");
		Course c2 = new Course("Science");
		Enrollment e1 = new Enrollment();
		Enrollment e2 = new Enrollment();
		e1.addCourse(c2);
		e1.showCourse();
		e2.addCourse(c1);
		e2.showCourse();
		
		System.out.println("Undergraduate Students : ");
		ug1.addEnrolledCourse(e1);
		ug1.showEnrolledCourse();
		ug1.showGrade();
		
		ug2.addEnrolledCourse(e2);
		ug2.showEnrolledCourse();
		ug2.showGrade();
	}

}

