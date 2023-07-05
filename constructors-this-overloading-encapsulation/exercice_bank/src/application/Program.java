package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		Account account = new Account(accountNumber, name);

		System.out.print("Is there an initial deposit (y/n)? ");
		String option = sc.next();

		if(option.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			account.deposit(amount);
		}

		System.out.println();
		System.out.println("Account data: \n" + account);

		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		
		System.out.print("Updated account data: \n" + account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		
		System.out.print("Updated account data: \n" + account);
		
		sc.close();
	}
}
