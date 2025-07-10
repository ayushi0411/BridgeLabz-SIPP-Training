package Day6_ProgrammingElement;
abstract class LibraryItem{
	int itemId;
	String title;
	String author;
	private boolean isAvailable = true;
	private String borrowerName;
	
	LibraryItem(int itemId, String title, String author){
		this.itemId = itemId;
		this.author = author;
		this.title = title;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getBorrowerName() {
        return borrowerName;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    protected void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }

    public abstract int getLoanDuration(); 
}

interface Reservable{
	void reserveItem(String borrowerName);
	boolean checkavailability();
}

class Book extends LibraryItem implements Reservable{

	Book(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public void reserveItem(String borrowerName) {
		if (isAvailable()) {
            setAvailable(false);
            setBorrowerName(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is not available for reservation.");
        }
	}

	@Override
	public boolean checkavailability() {
		return isAvailable();
	}

	@Override
	public int getLoanDuration() {
		return 14;
	}
}

class Magazine extends LibraryItem implements Reservable{
	
	Magazine(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public void reserveItem(String borrowerName) {
		if (isAvailable()) {
            setAvailable(false);
            setBorrowerName(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is not available for reservation.");
        }
	}

	@Override
	public boolean checkavailability() {
		return isAvailable();
	}

	@Override
	public int getLoanDuration() {
		return 35;
	}
}

class DVD extends LibraryItem implements Reservable{
	
	DVD(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public void reserveItem(String borrowerName) {
		if (isAvailable()) {
            setAvailable(false);
            setBorrowerName(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is not available for reservation.");
        }
	}

	@Override
	public boolean checkavailability() {
		return isAvailable();
	}

	@Override
	public int getLoanDuration() {
		return 21;
	}
}

public class LibraryManagementSystem {

	public static void main(String[] args) {
		LibraryItem l1 = new Book(34, "Wings of fire" , "Rammohan");
		LibraryItem l2 = new Magazine(344, "Flower", "Krishna");
		LibraryItem l3 = new DVD(345, "Past", "ayesha");
		
		LibraryItem[] items = {l1, l2, l3};

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println();
        }
        
        Reservable resBook = (Reservable) l1;
        Reservable resMagazine = (Reservable) l2;
        Reservable resDVD = (Reservable) l3;

        resBook.reserveItem("Ashi");
        resMagazine.reserveItem("Bobby");
        resDVD.reserveItem("Carla");

        System.out.println();

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails() + ", Borrower: " + item.getBorrowerName());
        }

	}

}
