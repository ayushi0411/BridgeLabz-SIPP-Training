package Day6_ProgrammingElement;

abstract class BankAccount{
	int accountNumber;
	String holderName;
	double balance;
	
	BankAccount(int accountNumber, String holderName, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.holderName = holderName;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void setBalance(double balance) {
        this.balance = balance;
    }
	
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposited amount: "+ amount);
		}else {
			System.out.println("Invalid deposit");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdraw amount: "+amount);
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	public abstract void  calculateInterest();
	
	public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: $" + balance);
    }
}

interface Loanable{
	void applyForLoan(double amount);
	boolean calculatedLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable{
	private static final double interestrate = 0.04;
	
	SavingsAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	@Override
	public void applyForLoan(double amount) {
		System.out.println("Savings Account Loan Application for: "+ amount);
	}

	@Override
	public boolean calculatedLoanEligibility() {
		boolean eligible = getBalance() >= 10000; 
        System.out.println("Loan eligibility for SavingsAccount: " + eligible);
        return eligible;
	}

	@Override
	public void calculateInterest() {
		double interest = getBalance() * interestrate;
        setBalance(getBalance() + interest);
        System.out.println("Interest added to SavingsAccount: " + interest);
	}	
}

class CurrentAccount extends BankAccount implements Loanable{
    private static final double interstrate = 0.5;
	CurrentAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	@Override
	public void applyForLoan(double amount) {
		System.out.println("Current Account Loan Application for: "+ amount);
	}

	@Override
	public boolean calculatedLoanEligibility() {
		boolean eligible = getBalance() >= 10000; 
        System.out.println("Loan eligibility for SavingsAccount: " + eligible);
        return eligible;
	}

	@Override
	public void calculateInterest() {
		double interest = getBalance()*interstrate;
		setBalance(getBalance() + interest);
		System.out.println("Interest added to CurrentAccount: " + interest);
	}
	
}
public class BankingSystem {

	public static void main(String[] args) {
		BankAccount b1 = new SavingsAccount(3456789, "Ram", 20000.0);
		BankAccount b2 = new CurrentAccount(9876543, "Mohan", 30000.0);
		
		b1.deposit(20000.0);
		b1.withdraw(3000.0);
		b1.calculateInterest();
		b1.displayDetails();
		System.out.println();
		b2.deposit(30000.0);
		b2.withdraw(500.0);
		b2.calculateInterest();
        b2.displayDetails();
	}

}
