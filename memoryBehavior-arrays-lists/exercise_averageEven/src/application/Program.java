package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values will receive the array? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		double value = 0.0;
		int quantity = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0) {
				value += vect[i];
				quantity ++;
			}
		}
		
		double average = value/quantity;
		
		if(average > 0) {
			System.out.printf("AVERAGE OF EVEN NUMBERS: %.1f%n", average);
		}else {
			System.out.println("NO EVEN NUMBER");
		}
		
		sc.close();
	}

}
