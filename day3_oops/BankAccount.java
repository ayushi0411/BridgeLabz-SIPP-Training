package day3_oops; 
class BankAccounts {
    final String accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    public BankAccounts(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayDetails() {
        if (this instanceof BankAccounts) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: ₹" + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}

public class BankAccount{
    public static void main(String[] args) {
        BankAccounts acc1 = new BankAccounts("SBI001", "Amit", 5000);
        BankAccounts acc2 = new BankAccounts("SBI002", "Neha", 7000);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
        System.out.println();

        BankAccounts.getTotalAccounts();
    }
		
	}

