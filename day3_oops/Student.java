package day3_oops;
class Students {
    final int rollNumber;
    String name;
    String grade;

    static String universityName = "Global University";
    static int totalStudents = 0;

    public Students(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public void displayDetails() {
        if (this instanceof Students) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Students) {
            this.grade = newGrade;
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

public class Student {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Ayushi verma", "A");
        Students s2 = new Students(102, "Sneha Sharma", "B");

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
        System.out.println();

        s2.updateGrade("A+");
        System.out.println("Grade updated for Sneha Sharma\n");

        s2.displayDetails();
        System.out.println();

        Students.displayTotalStudents();
    }
}
