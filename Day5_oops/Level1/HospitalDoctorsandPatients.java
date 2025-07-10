package Day5_ProgrammingElements.Level1;
import java.util.ArrayList;

class Patient {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void showDoctors() {
        System.out.println(name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("Dr. " + d.name);
        }
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
        patients.add(patient);
        patient.addDoctor(this);
    }

    void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println(p.name);
        }
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void showDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("Dr. " + d.name);
        }
    }

    void showPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient p : patients) {
            System.out.println(p.name);
        }
    }
}

public class HospitalDoctorsandPatients{
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Mangal");
        Doctor d2 = new Doctor("Singh");

        Patient p1 = new Patient("Ram");
        Patient p2 = new Patient("Mohan");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        hospital.showDoctors();
        hospital.showPatients();

        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();
    }
}
