package Level1;
public class Books {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is already borrowed.");
        }
    }

    public void displayDetails() {
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : $" + price);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Atomic Habits", "James Clear", 350.0);

        System.out.println("Book Details:");
        book1.displayDetails();

        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBooks();

        System.out.println("\nAttempting to borrow again...");
        book1.borrowBooks();

        System.out.println("\nUpdated Book Details:");
        book1.displayDetails();
    }
}
