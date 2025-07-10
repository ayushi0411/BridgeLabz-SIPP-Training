package Day4_ProgrammingElements.SingleInheritance;

class Device{
	String deviceId;
	String status;
	
	Device(String deviceId, String status){
		this.deviceId = deviceId;
		this.status = status;
	}
	
	void displayStatus() {
		System.out.println("Device Id: "+ deviceId);
		System.out.println("Status: "+status);
	}
}

class Thermostat extends Device{
	double temperatureSetting;
	
	Thermostat(String deviceId, String status, double temperatureSetting){
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}
public class SmartHomeDevices {

	public static void main(String[] args) {
		Thermostat thermostat = new Thermostat("Th1234", "online", 25.5);
		thermostat.displayStatus();
	}

}
