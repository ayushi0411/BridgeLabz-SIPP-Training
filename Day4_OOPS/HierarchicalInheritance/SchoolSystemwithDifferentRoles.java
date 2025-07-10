package Day4_ProgrammingElements.HierarchicalInheritance;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void displaydetails() {
		
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		
	}
}

class Teacher extends Person{
	String subject;
	
	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	
	void displayRole() {
		System.out.println();
		System.out.println("The role is Teacher");
	}
	
	void displaydetails() {
		super.displaydetails();
		System.out.println("The subject is : "+ subject);
		System.out.println();
	}
}

class Student extends Person{
	String grade;
	
	Student(String name, int age, String grade){
		super(name, age);
		this.grade = grade;
	}
	
	void displayRole() {
		System.out.println("This is a student");
	}
	
	void displaydetails() {
		super.displaydetails();
		System.out.println("The grade is :"+ grade);
		System.out.println();
	}
}
public class SchoolSystemwithDifferentRoles {

	public static void main(String[] args) {
		Person p = new Person("Samay", 20);
		Teacher t = new Teacher("Mohan", 35, "Maths");
		Student s = new Student("Ashi", 15, "A");
		
		p.displaydetails();
		t.displayRole();
		t.displaydetails();
		s.displayRole();
		s.displaydetails();

	}

}
