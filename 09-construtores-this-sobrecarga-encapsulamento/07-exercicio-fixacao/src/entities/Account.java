package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account() {
	}

	public Account(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double depositValue) {
		setBalance(depositValue + getBalance());
	}
	
	public void withdraw(double withdrawValue) {
		setBalance((getBalance() - withdrawValue) - 5.00);
	}
	
}
