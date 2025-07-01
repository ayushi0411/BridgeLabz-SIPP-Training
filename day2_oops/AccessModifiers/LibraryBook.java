package AccessModifiers;

class  Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookInfo() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN      : " + ISBN);        
        System.out.println("Title     : " + title);        
        System.out.println("Author    : " + getAuthor());  
        System.out.println("File Size : " + fileSizeMB + " MB");
    }
}

public class LibraryBook{
    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "Java Basics", "Ayushi Verma", 1.5);
        ebook.displayEBookInfo();

        ebook.setAuthor("A. Verma"); // Update author
        System.out.println("\nAfter updating author:");
        ebook.displayEBookInfo();
    }
}

