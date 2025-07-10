package Day4_ProgrammingElements.SingleInheritance;

class Book{
	String title;
	int publicationYear;
	
	Book(String title, int publicationYear){
		this.title= title;
		this.publicationYear = publicationYear;
	}
	
	void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Publication Year: "+publicationYear);
	}
}
class Author extends Book{
	String name;
	String bio;
	
	Author(String title, int publicationYear, String name, String bio){
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("Name: "+ name);
		System.out.println("Bio: "+ bio);
	}
}
public class LibraryManagementwithBooksandAuthors {

	public static void main(String[] args) {
		Author book1 = new Author("The Great Adventure", 2020, "Alice Walker", "Alice Walker is an award-winning novelist known for her vivid storytelling.");
		book1.displayInfo();
	}

}
