package Day5_ProgrammingElements.Level2;
import java.util.*;
class Subject {
     String name;
     int marks;

     Subject(String name, int marks) {
          this.name = name;
          this.marks = marks;
     }
}

class Student {
     String name;
     List<Subject> subjects;

     Student(String name) {
          this.name = name;
          this.subjects = new ArrayList<>();
     }

     void addSubject(Subject subject) {
          subjects.add(subject);
     }
}

class GradeCalculator {
     String calculateGrade(Student student) {
          int totalMarks = 0;
          for (Subject subject : student.subjects) {
               totalMarks += subject.marks;
          }

          double average = student.subjects.size() > 0 ? (double) totalMarks / student.subjects.size() : 0;

                if (average >= 90) {
                    return "A";
                } else if (average >= 80) {
                    return "B";
                } else if (average >= 70) {
                    return "C";
                } else if (average >= 60) {
                    return "D";
                } else {
                    return "F";
                }
      }
}


public class SchoolApp {
     public static void main(String[] args) { 
    	 Subject maths = new Subject("Maths", 90);
         Subject science = new Subject("Science", 85);

         Student student = new Student("John");
         student.addSubject(maths);
         student.addSubject(science);
   
         GradeCalculator calculator = new GradeCalculator();

         String grade = calculator.calculateGrade(student);

         System.out.println(student.name + " Grade: " + grade);
     }
}

