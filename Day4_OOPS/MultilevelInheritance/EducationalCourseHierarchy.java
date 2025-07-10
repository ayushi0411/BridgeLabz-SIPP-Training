package Day4_ProgrammingElements.MultilevelInheritance;
class Course{
	String courseName;
	int duration;
	
	Course(String courseName, int duration){
		this.courseName = courseName;
		this.duration = duration;
	}
	
	void displaydetails() {
		System.out.println();
		System.out.println("Course Name: "+ courseName);
		System.out.println("Duration: "+ duration);
	}
}

class OnlineCourse extends Course{
	String platform;
    boolean isRecorded;
	
	OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
		super(courseName, duration);
		this.isRecorded = isRecorded;
	    this.platform = platform;
	}
	
	void displaydetails() {
		super.displaydetails();
		System.out.println("Platform: "+ platform);
		System.out.println("is Recorded: "+ isRecorded);
	}
}

class PaidOnlineCourse extends OnlineCourse{
	double fee;
	double discount;
	
	PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount){
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	
	void displaydetails() {
		super.displaydetails();
		System.out.println("Fee: "+ fee);
		System.out.println("Discount: "+ discount);
	}
}
public class EducationalCourseHierarchy {

	public static void main(String[] args) {
		Course c1 = new Course("Java", 5);
		OnlineCourse c2 = new OnlineCourse("Java", 5, "Udemy", true);
		PaidOnlineCourse c3 = new PaidOnlineCourse("Java", 5, "Udemy", true, 1500.0, 500.0);
        
		c1.displaydetails();
		c2.displaydetails();
		c3.displaydetails();
	}

}
