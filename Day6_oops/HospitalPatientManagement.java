package Day6_ProgrammingElement;
import java.util.*;
abstract class Patient{
	String patientId;
	String name;
	int age;
	
	Patient(String patientId, String name, int age){
		this.age = age;
		this.name = name;
		this.patientId = patientId;
	}
	
	private String diagnosis;
	private List<String> medicalHistory = new ArrayList<>();
	
	public String getDiagnosis() {
		return diagnosis;
	}
	
	public void SetDiagnosis(String diagnosis){
		this.diagnosis= diagnosis;
	}
	
	public List<String> getMedicalHistory(){
		return medicalHistory;
	}
	
	public abstract double calculateBill();
	void getPatientDetails() {
		System.out.println("Patient Id: "+ patientId);
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Diagnosis: "+ diagnosis);
	}
}

interface MedicalRecord{
	String addRecord(String record);
	void viewRecords();
}

class InPatient extends Patient implements MedicalRecord{
	private int daysAdmitted;
    private double dailyRate;
	InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
		super(patientId, name, age);
		this.daysAdmitted = daysAdmitted;
		this.dailyRate = dailyRate;
	}

	@Override
	public String addRecord(String record) {
		getMedicalHistory().add(record);
		return "Record added to In-Patient: " + record; 
	}

	@Override
	public void viewRecords() {
		System.out.println("Medical History for In-Patient:");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
	}

	@Override
	public double calculateBill() {
		double bill = daysAdmitted * dailyRate;
        System.out.println( "In-Patient Bill: $" );
        return bill;
	}
	
}

class OutPatient extends Patient implements MedicalRecord{
	private double consultationFee;
	public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        System.out.println("Out-Patient Bill: $" + consultationFee);
        return consultationFee;
    }

    @Override
    public String addRecord(String record) {
        getMedicalHistory().add(record);
        System.out.println("Record added to Out-Patient: ");
		return record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History for Out-Patient:");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
	
}
public class HospitalPatientManagement {

	public static void main(String[] args) {
		Patient inpatient = new InPatient("IP1001", "Isha", 35, 5, 2000);
        Patient outpatient = new OutPatient("OP2002", "Bob", 28, 500);

        inpatient.SetDiagnosis("Appendicitis");
        outpatient.SetDiagnosis("Flu");

        MedicalRecord inRecord = (MedicalRecord) inpatient;
        inRecord.addRecord("Surgery performed successfully.");
        inRecord.addRecord("Post-operative care.");

        MedicalRecord outRecord = (MedicalRecord) outpatient;
        outRecord.addRecord("Prescribed antibiotics.");
        outRecord.addRecord("Follow-up next week.");

        System.out.println();

        Patient[] patients = {inpatient, outpatient};

        for (Patient p : patients) {
            p.getPatientDetails();
            p.calculateBill();
            System.out.println();
        }

        inRecord.viewRecords();
        System.out.println();
        outRecord.viewRecords();

	}

}
