package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values will the array receive? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double value = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			value += vect[i];
		}
		
		double average = value/vect.length;
		System.out.println();
		System.out.println("ARRAY AVERAGE: " + average);
		System.out.println("BELOW AVERAGE VALUES: ");
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] < average) {
				System.out.println(String.format("%.1f", vect[i]));
			}
		}
		
		sc.close();
	}
}
