package Day4_ProgrammingElements.Introduction;
class Animal{
	String name;
	int age;
	
	Animal(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	void makesound() {
		System.out.println("Animal make sound. ");
	}
}

class Dog extends Animal {
	Dog(String name, int age){
		super(name, age);
	}
	
	void makesound() {
		System.out.println("Woof! Woof!");
	}
}

class Cat extends Animal{
	Cat(String name, int age){
		super(name, age);
	}
	
	void makesound() {
		System.out.println("Meow! Meow!");
	}
}

class Bird extends Animal{
	Bird(String name, int age){
		super(name, age);
	}
	
	void makesound() {
		System.out.println("Tweet! Tweet!");
	}
}
public class AnimalHierarchy {

	public static void main(String[] args) {
		Animal dog = new Dog("Chiku", 3);
		Animal cat = new Cat("Miru", 4);
		Animal bird = new Bird("Peee", 2);
       
		dog.makesound();
		cat.makesound();
		bird.makesound();
	}

}
