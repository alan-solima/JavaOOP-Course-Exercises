package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALUES = ");
		for(int i=0; i<vect.length; i++) {
			System.out.print(vect[i]+"  ");
		}
		
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			sum += vect[i];	
		}
		
		System.out.println();
		System.out.printf("SUM = %.2f%n", sum);
		double avg = sum/vect.length;
		System.out.printf("AVERAGE = %.2f%n", avg);
		
		sc.close();
	}
}
