package Level2;
public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ayushi Verma", "ACC123456", 1000.0);
        account.displayBalance();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);
        account.displayBalance();
    }
}
