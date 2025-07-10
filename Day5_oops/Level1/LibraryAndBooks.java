package Day5_ProgrammingElements.Level1;
import java.util.*;

class Book{
	private String title;
	private String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public String gettitle() {
		return title;
	}
	
	public String getauthor() {
		return author;
	}
	
	void displayInfo() {
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
	}
}

class Library{
	private String name;
	private ArrayList<Book> Books;
	
	Library(String name){
		this.name = name;
		Books = new ArrayList<>();
	}
	
	void addBook(Book book) {
		Books.add(book);
	}
	
	void displayInfo() {
		System.out.println("Library: "+ name);
		System.out.println("Books in this library: ");
		for(Book book : Books) {
			book.displayInfo();
		}
		System.out.println();
	}
}
public class LibraryAndBooks {

	public static void main(String[] args) {
		Book book1 = new Book("Science", "Raj Sharma");
        Book book2 = new Book("Math", "Kirti");
        Book book3 = new Book("Physics", "Mohan");

        Library cityLibrary = new Library("City Library");
        Library universityLibrary = new Library("University Library");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        universityLibrary.addBook(book2); 
        universityLibrary.addBook(book3);

        cityLibrary.displayInfo();
        universityLibrary.displayInfo();
	}

}
