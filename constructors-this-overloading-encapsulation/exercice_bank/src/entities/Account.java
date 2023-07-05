package entities;

public class Account {
	
	private final double rate = 5.00;
	private int accountNumber;
	private String name;
	private double balance;
	
	public Account() {
	}
	
	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= (amount+rate);
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance)
				+ "\n";
	}
}
