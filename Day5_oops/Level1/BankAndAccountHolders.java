package Day5_ProgrammingElements.Level1;
import java.util.*;
class Bank{
	String name;
	Bank(String name){
		this.name = name;
	}
	
	void openAccount(Customer customer, String accountNumber, double initialBalance) {
        Account newAccount = new Account(accountNumber, initialBalance, this);
        customer.addAccount(newAccount);
        System.out.println("Account " + accountNumber + " opened for " + customer.name + " in " + this.name);
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts;

    Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println("Balances for " + this.name + ":");
        for (Account account : accounts) {
            System.out.println("Account: " + account.accountNumber + "  Balance: " + account.balance);
        }
    }
}

class Account {
    String accountNumber;
    double balance;
    Bank bank;

    Account(String accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }
}
public class BankAndAccountHolders {

	public static void main(String[] args) {
		Bank bank = new Bank("State Bank of India");
        Customer customer = new Customer("Ram");

        bank.openAccount(customer, "ACC123", 5000.0);
        bank.openAccount(customer, "ACC124", 2000.0);

        customer.viewBalance();

	}

}
