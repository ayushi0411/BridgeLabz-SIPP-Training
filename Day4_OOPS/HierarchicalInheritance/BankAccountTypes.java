package Day4_OOPS.HierarchicalInheritance;
class BankAccount{
	int accountNumber;
	double balance;
	
	BankAccount(int accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void displaydetails() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+ balance);
	}
}

class SavingsAccount extends BankAccount{
	double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }

    void displaySavingsDetails() {
        displaydetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }

    void displayCheckingDetails() {
        displaydetails();
        System.out.println("Withdrawal Limit: Rs " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod; 
    
    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }

    void displayFixedDepositDetails() {
        displaydetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

public class BankAccountTypes {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(123, 5000.0, 4.5);
        CheckingAccount ca = new CheckingAccount(456, 2000.0, 10000.0);
        FixedDepositAccount fda = new FixedDepositAccount(789, 100000.0, 12);

        sa.displayAccountType();
        sa.displaySavingsDetails();
        System.out.println();

        ca.displayAccountType();
        ca.displayCheckingDetails();
        System.out.println();

        fda.displayAccountType();
        fda.displayFixedDepositDetails();

	}

}
