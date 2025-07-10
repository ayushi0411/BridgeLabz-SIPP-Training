package Day4_ProgrammingElements.HybridInheritance;

class Person{
	String name;
	int id;
	
	Person(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	void displayInfo() {
		System.out.println("Name: "+ name);
		System.out.println("Id: "+ id);
	}
}

interface Worker{
	Void perfomDuties();
}

class Chef extends Person implements Worker{
	String specialty;
	
	Chef(String name, int id, String specialty){
		super(name, id);
		this.specialty = specialty;
	}
	
	public void performDuties() {
        System.out.println("Chef " + name + " is preparing " + specialty + " dishes.");
    }

	@Override
	public Void perfomDuties() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Waiter extends Person implements Worker {

    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    public void performDuties() {
        System.out.println("Waiter " + name + " is serving " + tableCount + " tables.");
    }

	@Override
	public Void perfomDuties() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class RestaurantManagementSystemwithHybrid {

	public static void main(String[] args) {
		Chef chef = new Chef("Ravi", 101, "Italian");
        Waiter waiter = new Waiter("Amit", 201, 5);

        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();

	}

}
