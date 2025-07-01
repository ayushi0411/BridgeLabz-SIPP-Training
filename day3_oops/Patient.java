package day3_oops;
class Patients {
    final int patientID;
    String name;
    int age;
    String ailment;

    static String hospitalName = "CityCare Hospital";
    static int totalPatients = 0;

    public Patients(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public void displayDetails() {
        if (this instanceof Patients) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

public class Patient {
    public static void main(String[] args) {
        Patients p1 = new Patients(1001, "Ravi Kumar", 45, "Fever");
        Patients p2 = new Patients(1002, "Sneha Verma", 30, "Back Pain");

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
        System.out.println();

        Patients.getTotalPatients();
    }
}
