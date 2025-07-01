package day3_oops;
class Books {
    String title;
    String author;
    final String isbn;

    static String libraryName = "Central City Library";

    public Books(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        if (this instanceof Books) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

public class Book {
    public static void main(String[] args) {
        Books b1 = new Books("Wings of Fire", "A.P.J. Abdul Kalam", "9780141031069");
        Books b2 = new Books("The Alchemist", "Paulo Coelho", "9780061122415");

        b1.displayDetails();
        System.out.println();
        b2.displayDetails();
        System.out.println();

        Books.displayLibraryName();
    }
}
