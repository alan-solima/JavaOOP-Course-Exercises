package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			while(ch != 'i' && ch != 'c') {
				System.out.println("Enter a valid value.");
				System.out.print("Individual or company (i/c)? ");
				ch = sc.next().charAt(0);
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
				
			}else{
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				taxPayers.add(new Company(name, anualIncome, employeesNumber));
			}
		}
		
		double totalTaxes = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer taxPayer : taxPayers) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			totalTaxes += taxPayer.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxes);
		
		sc.close();
	}

}
