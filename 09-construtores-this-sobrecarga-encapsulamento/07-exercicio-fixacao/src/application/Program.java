package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		Integer accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		String initialDeposit = sc.nextLine();
		
		Double initialDepositValue = 0.00;
		
		if (initialDeposit.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			initialDepositValue = sc.nextDouble();
			sc.nextLine();
		}
		
		Account account = new Account(accountNumber, accountHolder, initialDepositValue);
		
		System.out.printf("%nAccount data:%nAccount %d, Holder: %s, Balance: $ %.2f%n%n", account.getAccountNumber(), account.getAccountHolder(), account.getBalance());
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		sc.nextLine();
		account.deposit(depositValue);
		
		System.out.printf("Updated account data:%nAccount %d, Holder: %s, Balance: $ %.2f%n%n", account.getAccountNumber(), account.getAccountHolder(), account.getBalance());
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		sc.nextLine();
		account.withdraw(withdrawValue);
		
		System.out.printf("Updated account data:%nAccount %d, Holder: %s, Balance: $ %.2f%n%n", account.getAccountNumber(), account.getAccountHolder(), account.getBalance());
		
		sc.close();
	}
}