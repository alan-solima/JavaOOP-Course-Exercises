package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers? ");
		int n = sc.nextInt();
		
		double vect[] = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		
        double higherValue = vect[0];
        int higherValuePosition = 0;

        for (int i = 1; i < vect.length; i++) {
            if (vect[i] > higherValue) {
                higherValue = vect[i];
                higherValuePosition = i;
            }
        }

        System.out.println("HIGHER VALUE = " + higherValue);
        System.out.println("HIGHER VALUE POSITION = " + higherValuePosition);
			
		sc.close();
	}

}
